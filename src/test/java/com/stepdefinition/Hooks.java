package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void browser() {
	launchBrowser();

	}
	@After
	public void closeBrowser(Scenario scenario) {
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		
		scenario.embed(b, "img");
		
		closeWindow();

	}

}
