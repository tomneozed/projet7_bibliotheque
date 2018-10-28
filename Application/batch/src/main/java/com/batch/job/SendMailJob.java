package com.batch.job;

import com.batch.SendMail;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class SendMailJob implements Job
{
	SendMail sendMail = new SendMail();


	public SendMailJob()
	{

	}

	public void execute(JobExecutionContext arg0){

		System.out.println("Hello world");
		sendMail.sendNotification();

	}

}
