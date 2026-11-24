package org.stepdefinition;

import org.mavbas.Baseclass;
import org.task1.POJOhomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass {
	@Given("User has to launch the browser and url")
	public void user_has_to_launch_the_browser_and_url() {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
	    
	}

	@When("User has to enter the valid username and valid password")
	public void user_has_to_enter_the_valid_username_and_valid_password() {
		POJOhomepage p=new POJOhomepage();
		p.getUsername().sendKeys("Afrith");
		p.getPassword().sendKeys("Afrith@2125");
	    
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		POJOhomepage p=new POJOhomepage();
		p.getLogin().click();
	    
	}

	@Then("Verify that user has reached the homepage and close the browse")
	public void verify_that_user_has_reached_the_homepage_and_close_the_browse() {
	    
	}

}
