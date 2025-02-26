package org.asd;

import org.testng.asserts.SoftAssert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Softassertion {
  @Test
  public void f() {
	  
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pbala\\Downloads\\Seleniumprojects\\seleniumproject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
		softAssert.assertEquals(Title, "Googleeee");
		
		driver.quit();
		
		 // Collect and report all failures
        softAssert.assertAll();
  }
}
