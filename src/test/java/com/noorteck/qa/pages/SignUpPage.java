package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI{
	

	@FindBy(xpath = "//input[@id='user_email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='user_password']")
	WebElement passwordField;

	@FindBy(xpath = "//input[@name='commit']")
	WebElement signupButton;



	public SignUpPage(){
		PageFactory.initElements(driver, this);
	}
	public void enteremail(String useremail) {
		enter(emailField, useremail);
	}
	public void enterpassword(String userpassword) {
		enter(passwordField,userpassword);
	}
	
 public void clicksignup() {
	click(signupButton);
 }
}

