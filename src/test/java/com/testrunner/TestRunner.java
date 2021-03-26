package com.testrunner;


import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Acer\\Desktop\\cucumber\\CucumberTask\\src\\test\\resources",glue="com.stepdefinition",
plugin= {"json:C:\\Users\\Acer\\Desktop\\cucumber\\CucumberTask\\src\\test\\resources\\report.json"},
tags= {"@smoke"},dryRun=false,monochrome=true)
public class TestRunner {
	
	

}
//D:\\Workspace\\CucumberTask\\src\\test\\resources
