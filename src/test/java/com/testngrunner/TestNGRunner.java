package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Feature",
		glue = "com.stepdefinition",
		tags = "@Actual"
		
		)
public class TestNGRunner extends  AbstractTestNGCucumberTests {

}
