package org.asd;

import org.testng.annotations.Test;

public class DependsonMethods {

	@Test(priority=1)
    public void login() {
        
		System.out.println("Login Test Executed");
        // Simulate successful login
	  //  int i = 1/0;
    }

    @Test (priority=2)
    public void testNegative() {
        System.out.println("Negative Priority Test");
    }
    
    @Test(dependsOnMethods = {"login"})
    
    public void accessDashboard() {
        
    	System.out.println("Access Dashboard Test Executed");
        // This test depends on login
    	
    }
    
    
  @Test(dependsOnMethods = {"login", "accessDashboard"})
   
    public void logout() {
        
    	System.out.println("Logout Test Executed");
        // This test depends on both login and accessDashboard
    }
	
	
}
