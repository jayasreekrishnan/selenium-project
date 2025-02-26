package org.asd;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	@Test
    @Parameters({"name", "age"})
    public void openWebsite(String n, String a) {
        System.out.println("My name is" + n);
        System.out.println("Age " + a);
    }

    @Test
    @Parameters({"degree", "native"})
    public void verifyTitle(String d, String n) {
        System.out.println("Education Qualification" + d);
        System.out.println("Address " + n);
    }
}
