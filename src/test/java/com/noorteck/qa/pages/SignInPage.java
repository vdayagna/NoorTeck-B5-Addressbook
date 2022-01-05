package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {

	@FindBy(xpath = "//input[@id='session_email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='session_password']")
	WebElement passwordField;

	@FindBy(xpath = "//input[@name='commit']")
	WebElement signinButton;

	public SignInPage() {
		PageFactory.initElements(driver,this);
	}
	public void enteremail(String session_email) {
		enter(emailField, session_email);
	}
	public void clicksignin() {
		click(signinButton);
}
	public void enterpasswordField(String sessionpassword) {
		enter(passwordField, sessionpassword);
		
	}
}

