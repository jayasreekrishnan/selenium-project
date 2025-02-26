package org.asd;

import org.testng.annotations.Test;

public class paralleltest {
	@Test
    public void testMethod1() {
        System.out.println("Hi1" + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Hello1" + Thread.currentThread().getId());
    }
}
