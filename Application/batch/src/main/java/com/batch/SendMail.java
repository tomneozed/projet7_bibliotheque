package com.batch;

import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.PretResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.io.File;
import java.util.Properties;

public class SendMail {

    @Autowired
    private JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

    @Autowired
    private BibliothekService bibliothek;

    //Logger
    private static final Logger logger = LogManager.getLogger(SendMail.class);

    public SendMail() {
        initJMSender();
    }

    public void sendNotification(String receiverEmail)throws MailException
    {
        logger.info("Sending mail to : " + receiverEmail + "...");
        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(receiverEmail);
        mail.setFrom("bibliothekDAJava@gmail.com");
        mail.setSubject("Test");
        mail.setText("This is a test");

        javaMailSender.send(mail);
        logger.info("Email sent to " + receiverEmail);
    }

    public void sendMailToThieves()
    {
        int i;
        if(bibliothek != null)
        {
            if(bibliothek.notRenderedLoans().getPretBeanList().size() > 0)
            {
                for(i = 0; i < bibliothek.notRenderedLoans().getPretBeanList().size(); i++)
                {
                    sendNotification(bibliothek.notRenderedLoans().getPretBeanList().get(0).getUtilisateurPojo().getEmail());
                }
                logger.info("Emails sent to " + (i+1) + " persons ");
            }else
            {
                logger.info("No thief today :)");
            }
        }else
        {
            logger.error("Connection to API server failed :(");
        }

    }

    public void initJMSender()
    {
        System.setProperty("log4j.configuration", String.valueOf(new File("resources", "log4j.xml")));
        logger.info("Mail sender initilialisation");
        javaMailSender.setPort(587);
        javaMailSender.setHost("smtp.gmail.com");
        javaMailSender.setPassword("Bibliothek31@");
        javaMailSender.setUsername("BibliothekDAJava@gmail.com");

        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    }
}
