package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class OrderIdPage extends BaseClass{
	
	public OrderIdPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(id="order_no")
	private WebElement orderNum;
	
	public WebElement getOrderNum() {
		return orderNum;
	}
	

}
