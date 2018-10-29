package com.test.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	@Before
	public void beforetest() {
		System.out.println("This is Before");
	}
	@After
	public void aftertest() {
		System.out.println("This is After");
	}
	@Given("^Open the application$")
	public void open_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Given");
	}

	@When("^Do something$")
	public void do_something() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is When");
	}

	@When("^Do another thing$")
	public void do_another_thing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is When");
	}

	@Then("^Expect something positive$")
	public void expect_something_positive() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Then");
	}
	@Given("^Open the another app$")
	public void open_the_another_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Scenario2 Given");
	}

	@When("^Do something different$")
	public void do_something_different() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Scenario2 When");
	}

	@When("^Do another thing(\\d+)$")
	public void do_another_thing(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Scenario2 When");
	}

	@Then("^Expect something positive(\\d+)$")
	public void expect_something_positive(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Scenario2 Then");
	}


}
