package org.asd;

import org.testng.ITestListener;



import org.testng.ITestResult;


//IListener class implements the ITestListener interface
public class IListener implements ITestListener {

	    @Override
	    public void onTestStart(ITestResult result) {
	       
	    	System.out.println("Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        
	    	System.out.println("Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        
	    	
	    	System.out.println("TestFailed: " + result.getName());
	       
	    }

}
