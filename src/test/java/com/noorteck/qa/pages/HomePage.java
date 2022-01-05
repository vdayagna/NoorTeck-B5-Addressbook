package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//a[@class ='nav-item nav-link active']")
	WebElement home;
	
	@FindBy(xpath = "//*[text() = 'Addresses']")
    WebElement addresses;
	
	@FindBy(xpath = "//*[text() = 'Sign out']")
    WebElement signoutButton;
	
	@FindBy(xpath ="//h1[text() = 'Welcome to Address Book']" )
	WebElement welcometoaddressbook;

;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
		
		}
	public void clickhome(String navitemnavlinkactive){
		click(home);
	}
	public void clickaddress() {
		click(addresses);
	}
	public void clickSignOut( ) {
		click(signoutButton);
	}
	//public void enterwelcometoaddressbook(String WelcometoAddressBook) {
		//enter(welcometoaddressbook, WelcometoAddressBook);
	
 public String welcomeTitle() {
	 return getText(welcometoaddressbook);
 }
}

