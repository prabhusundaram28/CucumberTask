package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNum;
	
	@FindBy(id="datepick_in")
	private WebElement dateCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement dateCheckOut;
	
	
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private WebElement submitBtn;
	
	@FindBy(id="checkin_span")
	private WebElement checkIn;
	
	@FindBy(id="checkout_span")
	private WebElement checkOut;
	
	@FindBy(id="location_span")
	private WebElement emptyError;
	
	public WebElement getEmptyError() {
		return emptyError;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNum() {
		return roomNum;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getDateCheckIn() {
		return dateCheckIn;
	}

	public WebElement getDateCheckOut() {
		return dateCheckOut;
	}

}
