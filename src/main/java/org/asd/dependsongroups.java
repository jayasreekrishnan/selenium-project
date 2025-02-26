package org.asd;

import org.testng.annotations.Test;

public class dependsongroups {
	
	    //Using groups dependency tag 
	@Test(groups = "Signin")
    public void testLoginAdmin() {
        System.out.println("Admin Login Test Executed");
        int i = 1/0;
       
    }

    @Test(groups = "Signin")
    public void testLoginUser() {
        System.out.println("User Login Test Executed");
    }

    @Test(dependsOnGroups = {"Signin"})
    public void testAccessDashboard() {
        System.out.println("Access Dashboard Test Executed");
    }

    @Test(dependsOnGroups = {"Signin"})
    public void testLogout() {
        System.out.println("Logout Test Executed");
    }
}
