package com.testrunner;


import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Workspace\\CucumberTask\\src\\test\\resources",glue="com.stepdefinition",
plugin= {"json:D:\\Workspace\\CucumberTask\\src\\test\\resources\\Reporting.json"},
tags= {"@smoke"},dryRun=false,monochrome=true)
public class TestRunner {
	
	

}
