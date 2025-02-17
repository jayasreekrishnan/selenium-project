package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	
	 @Before("@Mytest")
	    public void setup() {
		 
		 
	        System.out.println("Before:Launching browser and opening application");
	    }
	 
	 @After("@Mytest")
	    public void tearDown() {
		 
	        System.out.println("After:Closing browser");
	    }



	

}
