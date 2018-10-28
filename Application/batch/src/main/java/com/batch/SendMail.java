package com.batch;

import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.PretResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class SendMail {

    @Autowired
    private JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

    private BibliothekService bibliothek;

    //PretResponse pretResponse = bibliothek.notRenderedLoans();

    public SendMail() {
    }

    public SendMail(BibliothekService bibliothek, PretResponse pretResponse) {
        this.bibliothek = bibliothek;
        //this.pretResponse = pretResponse;
    }

    public void sendNotification()throws MailException
    {
        javaMailSender.setPort(587);
        javaMailSender.setHost("smtp.gmail.com");
        javaMailSender.setPassword("Bibliothek31@");
        javaMailSender.setUsername("BibliothekDAJava@gmail.com");
        System.out.println("Hello world send mail");
        SimpleMailMessage mail = new SimpleMailMessage();

        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        //choper l'email d'un user
        //mail.setTo(pretResponse.getPretBeanList().get(0).getUtilisateurPojo().getEmail());
        mail.setTo("tomneozed@gmail.com");
        mail.setFrom("bibliothekDAJava@gmail.com");
        mail.setSubject("Test");
        mail.setText("This is a test");

        javaMailSender.send(mail);


    }
}
