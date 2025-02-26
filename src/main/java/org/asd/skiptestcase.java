package org.asd;

import org.testng.annotations.Test;

public class skiptestcase {
	@Test
    public void test1() {
        System.out.println("Test 1 is executed");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is skipped");
    }
    
    
    @Test(priority=-1,enabled=false)
    public void testNegative() {
        System.out.println("Negative Priority Test");
    }
}
