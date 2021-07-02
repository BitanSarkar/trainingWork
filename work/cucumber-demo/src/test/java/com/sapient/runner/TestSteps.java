package com.sapient.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/resources/com/sapient/userstories" }, glue = { "com.sapient.steps" }, plugin = {
		"pretty", "html:target/cucumber-report", "json:first-report.json" }, monochrome = true,
		// tags = { "~@Login" }
		// tags = { "@BitanRegister" })
		tags = { "@Sanity" })
public class TestSteps {

}
