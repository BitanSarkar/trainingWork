package com.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	@Given("^the application is loaded on the site stacktooflow\\.come$")
	public void the_application_is_loaded_on_the_site_stacktooflow_come() throws Throwable {
		System.out.println("The application is loaded");
	}

	@When("^the user clicks on the RegButton$")
	public void the_user_clicks_on_the_RegButton() throws Throwable {
		System.out.println("User clicks on RegButton");
	}

	@When("^enter user name as \"([^\"]*)\"$")
	public void enters_user_name_as(String arg1) throws Throwable {
		System.out.println("User name is " + arg1);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		System.out.println("Password is " + arg1);
	}

	@Then("^validate the format$")
	public void validate_the_format() throws Throwable {
		System.out.println("Validating Format");
	}

	@Then("^submit it to server$")
	public void submit_it_to_server() throws Throwable {
		System.out.println("submit to server");

	}
}
