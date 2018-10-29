package com.test.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\java\\com\\test\\features", 
		glue = {"com.test.stepdefinitions"},
//		format = {"pretty", "html:target/cucumber"},
		monochrome = true,
		strict = false,
		dryRun = false
//		tags = {"@test1"}
		
		
		
		
		
		)
public class TestRunner1 {
	
}	
