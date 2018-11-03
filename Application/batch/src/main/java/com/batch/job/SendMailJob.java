package com.batch.job;

import com.batch.SendMail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.util.Date;

public class SendMailJob implements Job
{
	SendMail sendMail = new SendMail();

	//Logger
	private static final Logger logger = LogManager.getLogger(SendMailJob.class);

	public SendMailJob()
	{
	}

	public void execute(JobExecutionContext arg0){
		logger.info("Job execution : " + new Date());
		sendMail.sendMailToThieves();
	}
}
