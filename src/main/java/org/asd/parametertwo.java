package org.asd;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertwo {
  @Test
  @Parameters ({"name", "age"})

  public void f(String n, String a) {
	  
	  System.out.println("My name is" + n);
      System.out.println("Age " + a);
  }
  
  @Test
  @Parameters({"degree" })
  public void details(String d) {
     
	  System.out.println("Education Qualification" + d);
  }

  
}
