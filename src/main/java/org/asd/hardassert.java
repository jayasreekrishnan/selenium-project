package org.asd;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;


@Listeners(IListener.class)
public class hardassert {
  @Test
  public void test() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pbala\\Downloads\\Seleniumprojects\\seleniumproject\\driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	   String Title = driver.getTitle();
		
		Assert.assertEquals(Title, "Gooogle");
		
	
		
		
	  	  
  }
}