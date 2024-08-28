package com.mobile.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/feature",
	    glue = {"com.mobile.automation.stepdefinations"},
	    plugin = {"pretty", "json:C:\\Users\\91883\\Desktop\\New Workplace\\mobile-automation\\target\\cucumber-report.json", "html:C:\\Users\\91883\\Desktop\\New Workplace\\mobile-automation\\target\\cucumber-report.html"},
	    monochrome = true 
	)
public class TestRunner {

}
