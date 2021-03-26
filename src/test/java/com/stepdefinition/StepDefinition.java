package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pages.BookingPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.OrderIdPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPage loginPage;
	SearchHotelPage searchHotelPage;
	SelectHotelPage selectHotelPage;
	BookingPage bookingPage;
	OrderIdPage orderIdPage;
	CancelBookingPage cancelBookingPage;

	@Given("user is on the adactin webpage")
	public void user_is_on_the_adactin_webpage() {

		loadUrl("http://adactinhotelapp.com/");
		System.out.println("browser launched");
	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String username, String password) {
		loginPage = new LoginPage();
		fill(loginPage.getUserName(), username);
		fill(loginPage.getPassword(), password);

	}

	@Then("user should click login button")
	public void user_should_click_login_button() {
		btnClick(loginPage.getLogin());
	}

	@Then("user should enter {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_enter_and(String location, String hotel, String roomType, String noOfRooms,
			String dateCheckIn, String dateCheckOut, String adultsPerRoom, String childPerRoom) {
		searchHotelPage = new SearchHotelPage();
		dropDown(searchHotelPage.getLocation(), location);
		dropDown(searchHotelPage.getHotel(), hotel);
		dropDown(searchHotelPage.getRoomType(), roomType);
		dropDown(searchHotelPage.getRoomNum(), noOfRooms);
		searchHotelPage.getDateCheckIn().clear();
		fill(searchHotelPage.getDateCheckIn(), dateCheckIn);
		searchHotelPage.getDateCheckOut().clear();
		fill(searchHotelPage.getDateCheckOut(), dateCheckOut);
		dropDown(searchHotelPage.getAdultPerRoom(), adultsPerRoom);
		dropDown(searchHotelPage.getChildPerRoom(), childPerRoom);
	}

	@Then("user should click search button")
	public void user_should_click_search_button() {
		searchHotelPage = new SearchHotelPage();
		btnClick(searchHotelPage.getSubmitBtn());

	}

	@Then("user should verfiy navigates to select hotel")
	public void user_should_verfiy_navigates_to_select_hotel() {
		verify("http://adactinhotelapp.com/SelectHotel.php");
	}

	@Then("user should select the hotel and click the continue button")
	public void user_should_select_the_hotel_and_click_the_continue_button() {
		selectHotelPage = new SelectHotelPage();
		btnClick(selectHotelPage.getSelectHotel());
		btnClick(selectHotelPage.getContinueBtn());
	}

	@Then("user should enter the {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_the_and(String firstName, String lastName, String address, String ccNum,
			String ccType, String expMonth, String expYear, String cvvNum) {
		bookingPage = new BookingPage();
		fill(bookingPage.getFirstName(), firstName);
		fill(bookingPage.getLastName(), lastName);
		fill(bookingPage.getAddress(), address);
		fill(bookingPage.getCcNum(), ccNum);
		dropDown(bookingPage.getCcType(), ccType);
		dropDown(bookingPage.getExpMonth(), expMonth);
		dropDown(bookingPage.getExpYear(), expYear);
		fill(bookingPage.getCvvNum(), cvvNum);
	}

	@Then("user should click the book now button")
	public void user_should_click_the_book_now_button() {
		bookingPage = new BookingPage();
		btnClick(bookingPage.getBookNowBtn());
	}

	@Then("user should print the orderId num")
	public void user_should_print_the_orderId_num() {
		orderIdPage = new OrderIdPage();
		getText(orderIdPage.getOrderNum());
	}

	@Then("user should enter {string},{string},{string},{string},{string}and{string}")
	public void user_should_enter_and(String location, String noOfRooms, String dateCheckIn, String dateCheckOut,
			String adultsPerRoom, String childPerRoom) {
		searchHotelPage = new SearchHotelPage();
		dropDown(searchHotelPage.getLocation(), location);
		dropDown(searchHotelPage.getRoomNum(), noOfRooms);
		fill(searchHotelPage.getDateCheckIn(), dateCheckIn);
		fill(searchHotelPage.getDateCheckOut(), dateCheckOut);
		dropDown(searchHotelPage.getAdultPerRoom(), adultsPerRoom);
		dropDown(searchHotelPage.getChildPerRoom(), childPerRoom);
	}

	@Then("user should verify the error message")
	public void user_should_verify_the_error_message() {
		errorMsg(searchHotelPage.getCheckIn());
		errorMsg(searchHotelPage.getCheckOut());
	}

	@Then("user should verify empty error message")
	public void user_should_verify_empty_error_message() {
		
		errorMsg(searchHotelPage.getEmptyError());
	}

	@Then("user should verify the booknow error message")
	public void user_should_verify_the_booknow_error_message() {
		errorMsg(bookingPage.getFirstNameError());
		errorMsg(bookingPage.getLastNameError());
		errorMsg(bookingPage.getAddressError());
		errorMsg(bookingPage.getCcNumError());
		errorMsg(bookingPage.getCcTypeError());
		errorMsg(bookingPage.getCcTypeError());
		errorMsg(bookingPage.getCvvNumError());
	}

	@Then("user click bookedItenary button")
	public void user_click_bookedItenary_button() {
		cancelBookingPage = new CancelBookingPage();
		btnClick(cancelBookingPage.getBookItenary());
	}

	@Then("click select button and cancel the order")
	public void click_select_button_and_cancel_the_order() {
		cancelBookingPage = new CancelBookingPage();
		btnClick(cancelBookingPage.getSelectBtn());
		alert();
	}

	@Then("user should search the orderId and calcel the order")
	public void user_should_search_the_orderId_and_calcel_the_order() {
		cancelBookingPage = new CancelBookingPage();
		orderId(cancelBookingPage.getOrderIdBox());
		btnClick(cancelBookingPage.getOrderSearch());
		btnClick(cancelBookingPage.getCancelBtn());
		alert();
		System.out.println("cancelled");
	}

}
