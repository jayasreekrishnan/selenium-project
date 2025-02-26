package org.asd;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "credentials")
  public void f(String username, String password) {
	 
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pbala\\Downloads\\Seleniumprojects\\seleniumproject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize browser window

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	    driver.findElement(By.name("name")).sendKeys(username);
	    driver.findElement(By.name("name")).sendKeys(password);
	    driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button')]]")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
  }

  @DataProvider(name = "credentials")
  public String[][] getdata() {
	  
	  String [][] data = new String[2][2];
	    
  	data[0][0] = "Admin";
  	data[0][1] = "admin123";
  	data[1][0] = "guest";
  	data[1][1] = "guest123";
  	return data;
   
  }
}
