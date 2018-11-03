package com.batch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    	System.out.println("Starting App.main");
    	Application app = new Application();
    	try {
			app.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
