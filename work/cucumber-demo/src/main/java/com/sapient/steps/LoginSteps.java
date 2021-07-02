package com.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^application is running$")
	public void application_is_running() throws Throwable {
		System.out.println("The application is running");
	}

	@When("^user enters valid email id as \"([^\"]*)\"$")
	public void user_enters_valid_email_id_as(String arg1) throws Throwable {
		System.out.println("Email id provided : " + arg1);
	}

	@When("^password as \"([a-zA-Z0-9]*)\"$")
	public void password_as(String arg1) throws Throwable {
		System.out.println("Password provided : " + arg1);
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("take to home");
	}
}
