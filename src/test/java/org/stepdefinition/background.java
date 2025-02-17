package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class background {
	
	
	@Given("to launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	   
		System.out.println("Chrome browser launched and window maximized");
		
	}

	@When("to launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    
		System.out.println("Facebook URL is launched in the browser");
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
	    
		System.out.println("User entered Username: " + username + " and Password: " + password);
		
	}

	@When("Click on the Login button")
	public void click_on_the_Login_button() {
		
		System.out.println("Login button clicked");
	    
	}
	

}
