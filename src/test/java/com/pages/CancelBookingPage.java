package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Booked Itinerary")
	private WebElement bookItenary;
	
	@FindBy(id="order_id_text")
	private WebElement orderIdBox;
	
	@FindBy(id="search_hotel_id")
	private WebElement orderSearch;
	
	@FindBy(name="cancelall")
	private WebElement cancelBtn;
	
	@FindBy(xpath="(//table//tr[2]//td[3])[3]")
	private WebElement selectBtn;

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getBookItenary() {
		return bookItenary;
	}

	public WebElement getOrderIdBox() {
		return orderIdBox;
	}

	public WebElement getOrderSearch() {
		return orderSearch;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

}
