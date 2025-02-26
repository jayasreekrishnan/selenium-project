package org.asd;

import org.testng.annotations.Test;

public class PrioritizingTest {
     @Test(priority=-1)
  public void testA() {
	  
	        System.out.println("Executing Test B");
	        }

	    @Test(priority=1)
	    public void testB() {
	        System.out.println("Executing Test A");
	    }

	    @Test(priority=2)
	    public void testC() {
	        System.out.println("Executing Test C");
	    }
	    
	    
	    @Test 
	    public void testNegative() {
	        System.out.println("Negative Priority Test");
	    }
	  
  
}
