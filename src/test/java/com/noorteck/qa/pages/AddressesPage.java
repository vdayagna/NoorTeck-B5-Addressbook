package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(xpath = "//a[text() = 'New Address']")
	WebElement newaddress;

	@FindBy(id ="//input[@id = 'address_first_name']")
	WebElement firstName;
	
	@FindBy(id = "//input[@id = 'address_last_name']")
	WebElement lastName;
	
	@FindBy(id = "//input[@id = 'address_street_address']")
	WebElement Address1;
	
	@FindBy(id = "//input[@id = 'address_secondary_address']")
	WebElement Address2;
	
	@FindBy(id = "//input[@id = 'address_city']")
	WebElement City;
	
	@FindBy(id = "//*[@id = 'address_state']")
	WebElement State;
	
	@FindBy(id = "//*[@id = 'address_zip_code']")
	WebElement ZipCode;
	
	@FindBy(id = "//*[@id = 'address_country_us']")
	WebElement Country;
	
	@FindBy(id = "//*[@id = 'address_age']")
	WebElement Age;
	
	@FindBy(id = "//*[@id = 'address_website']")
	WebElement Website;
	
	@FindBy(id = "//*[@id = 'address_phone']")
	WebElement Phone;
	
	@FindBy(id = "//*[@id = 'address_interest_dance']")
	WebElement DancingCheckBox;
	
	@FindBy(id = "//*[@id = 'address_note']")
	WebElement Note;
	
	@FindBy(xpath = "//input[@name='commit']")
	WebElement CreateAddress;
	
	@FindBy(xpath = "//div[@class ='alert alert-notice']")
	WebElement Addresswassuccessfullycreated;
	
	@FindBy(xpath = "//a[text() = 'Edit']")
	WebElement Edit;
	
	@FindBy(xpath = "//a[text() = 'List']")
	WebElement List;

	
	public AddressesPage() {
		PageFactory.initElements(driver,this);
	}
	public void clicknewaddress () {
	 click(newaddress);
	 }
	public void enterfirstName(String firstname ) {
		 enter(firstName,firstname);
	}
	public void enterlastName(String lastname) {
		 enter(lastName,lastname);
	}
	public void clickAddress1() {
		click(Address1);
	}
	public void enterAddress1(String addressstreetaddress) {
		enter(Address1, addressstreetaddress);
	}
	public void enterAddress2(String addresssecondaryaddress) {
		 enter(Address2,addresssecondaryaddress);
	}
	public void enterCity(String addresscity) {
		 enter(City, addresscity);
	}
	public void enterState(String addressstate) {
		 enter(State,addressstate);
	}
	public void enterZipCode(String addresszipcode) {
		 enter(ZipCode,addresszipcode);
	}
	public void clickCountryRadio() {
		 click(Country);
	}
	public void enterAge(String addressage) {
		 enter(Age,addressage);
	

	}
	public void enterWebsite(String addresswebsite) {
		 enter(Website,addresswebsite);
	}
	public void enterPhone(String addressphone) {
		 enter(Phone,addressphone);
	}
	public void clickDancing() {
		 click(DancingCheckBox);
	}
	public void enterNote(String addressnote) {
		 enter(Note,addressnote);
	}
	public void clickCreateAddress() {
		 click(CreateAddress);
	}
	public void enterAddresswassuccessfullycreated(String alertalertnotice) {
		 enter(Addresswassuccessfullycreated,alertalertnotice);
	}
	public void enterEdit(String edit) {
		 enter(Edit,edit);
	}
	public void clickList() {
		 click(List);

	}
	
	public void SelectStateDropDown(String value, String FL) {
		
		
	}
	//public void clickDancingCheckBox() {
	//click(clickDancingCheckbox);
		
	}
	
		
	


