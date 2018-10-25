package com.batch.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SendMailJob implements Job {
	@Autowired
	private JavaMailSender javaMailSender;


	public SendMailJob(JavaMailSender javaMailSender)
	{
		this.javaMailSender = javaMailSender;
	}

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		System.out.println("HelloWorld");

		SimpleMailMessage mail = new SimpleMailMessage();


		mail.setTo("pelissier.thomas31@gmail.com");
		mail.setFrom("pelissier.thomas31@gmail.com");
		mail.setSubject("Bonjour");
		mail.setText("Example");

		try {
			javaMailSender.send(mail);
		} catch (MailException e) {

		}


	}

}
