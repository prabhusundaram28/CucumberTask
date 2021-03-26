package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public  class BaseClass {
	public static   WebDriver driver;
	public static  void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	public static  void loadUrl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e, String data) {
		e.sendKeys(data);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void dropDown(WebElement e, String data) {
		Select s=new Select(e);
		s.selectByVisibleText(data);
	}
	public static void getText(WebElement e) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		String orderNum = e.getAttribute("value");
		System.out.println("My order Number is "+ orderNum);

	}
	public void verify(String data) {
		String s= data;
		System.out.println(s);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(data,currentUrl);

	}
	public void errorMsg(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}
	public void closeWindow() {
		driver.quit();
	}
	public void alert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void orderId(WebElement e) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		String orderNum = e.getAttribute("value");
		System.out.println("My order Number is "+ orderNum);
		e.sendKeys(orderNum);
	}
	
	
	
	

}
