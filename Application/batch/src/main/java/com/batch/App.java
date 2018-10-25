package com.batch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	System.out.println("Debut App.main");
    	Application app = new Application();
    	try {
			app.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

}
