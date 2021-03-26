package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectHotelPage  extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);}
	
	@FindBy(xpath="(//input[@type='radio'][1])")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	

}
