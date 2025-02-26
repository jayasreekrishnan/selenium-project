package org.asd;

import org.testng.annotations.Test;

public class paralleltesttwo {
	@Test
    public void testMethod1() {
        System.out.println("Hi2"  + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Hello2" + Thread.currentThread().getId());
    }
}
