package com.sapient.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPasswordSteps {
	@Given("^the site is up$")
	public void the_site_is_up() throws Throwable {
		System.out.println("The site is up");
	}

	@When("^check the password forgot for$")
	public void check_the_password_forgot_for(DataTable data) throws Throwable {
		List<Map<String, String>> forgotAccount = data.asMaps(String.class, String.class);
		forgotAccount.forEach((t) -> System.out.println(t.get("login") + "\t" + t.get("password")));
	}

	@Then("^show relevant message$")
	public void show_relevant_message() throws Throwable {
		System.out.println("The relevant password is shown");
	}
}
