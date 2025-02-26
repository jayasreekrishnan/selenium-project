package org.asd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations {
	
	
	@Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Executing After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Executing Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Executing After Suite");
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Executing Before Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Executing After Method");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Executing Before Suite");
    }
	

}
