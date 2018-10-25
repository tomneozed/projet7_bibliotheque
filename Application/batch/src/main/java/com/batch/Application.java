package com.batch;

import com.batch.job.SendMailJob;
import org.quartz.*;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class Application {

	public void run() throws Exception {
		System.out.println("Debut Application.run");
		SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();

  	  Scheduler sched = schedFact.getScheduler();

  	  sched.start();
  	  // define the job and tie it to our HelloJob class
  	  JobDetail job = newJob(SendMailJob.class)
  	      .withIdentity("myJob", "group1") // name "myJob", group "group1"
  	      .build();
  	

  	
	TriggerBuilder<SimpleTrigger> triggerBuilder = newTrigger().withIdentity("myTrigger", "group1").startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10)
	          .repeatForever());
    	 
  	Trigger trigger = triggerBuilder.build();



  	  // Tell quartz to schedule the job using our trigger
  	
		sched.scheduleJob(job, trigger);
	
	}

}
