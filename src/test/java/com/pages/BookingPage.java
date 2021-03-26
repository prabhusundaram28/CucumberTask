package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookingPage extends BaseClass{
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	@FindBy(id="book_now")
	private WebElement bookNowBtn;
	@FindBy(id="first_name_span")
	private WebElement firstNameError;
	@FindBy(id="last_name_span")
	private WebElement lastNameError;
	@FindBy(id="address_span")
	private WebElement addressError;
	@FindBy(id="cc_num_span")
	private WebElement ccNumError;
	@FindBy(id="cc_type_span")
	private WebElement ccTypeError;
	@FindBy(id="cc_expiry_span")
	private WebElement expireError;
	@FindBy(id="cc_cvv_span")
	private WebElement cvvNumError;
	
	public WebElement getFirstNameError() {
		return firstNameError;
	}
	public WebElement getLastNameError() {
		return lastNameError;
	}
	public WebElement getAddressError() {
		return addressError;
	}
	public WebElement getCcNumError() {
		return ccNumError;
	}
	public WebElement getCcTypeError() {
		return ccTypeError;
	}
	public WebElement getExpireError() {
		return expireError;
	}
	public WebElement getCvvNumError() {
		return cvvNumError;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
}
