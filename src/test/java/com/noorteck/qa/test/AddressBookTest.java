package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {


		

public static void main(String[] args) throws InterruptedException {
		
           String url = "http://a.testaddressbook.com/sign_up";
		
		
	//	CommonUI commonUIobj = new CommonUI();
	//	ObjInitialize obj = new ObjInitialize();
	//	AddressBookTest testobj = new AddressBookTest();
		
	 //   SignUpPage signupobj = new SignUpPage();
	 //   SignInPage signinobj = new SignIpPage();
	 //   HomePage homeobj = new HomePage();
	  //  AddressesPage addressesobj = new AddressesPage();
	
	
	
	    
		CommonUI.openBrowser("chrome"); //Open the browser
		CommonUI.navigate(url); //navigate to URL
		initializeClassObj();
		AddressBookTestOne();
		AddressBookTestTwo();
		CommonUI.quitBrowser();
		
		  url = "http://a.testaddressbook.com/sign_in";
	
		CommonUI.openBrowser("chrome"); 
		 CommonUI.navigate(url); 
		initializeClassObj();
		AddressBookTestTwo();
		
		CommonUI.quitBrowser();
	}
		public static void AddressBookTestOne() throws InterruptedException {
       SoftAssert softAssert = new SoftAssert();
        SignUpPage signupobj = new SignUpPage();
       
			signupobj.enteremail("jhon_cena10@gmail.com");
			signupobj.enterpassword("1234");
			signupobj.clicksignup();
		
			String expectedText = "Welcome to Address Book";
			String actualText = "Welcome to Address Book";

			softAssert.assertEquals(expectedText, actualText);
			Thread.sleep(2000);
			softAssert.assertAll();
			
			
		}
	
	public  static void AddressBookTestTwo() {
	      // SoftAssert softAssert = new SoftAssert();
		HomePage homeobj = new HomePage();
		 SignInPage signinobj = new SignInPage();
		 AddressesPage addressesobj = new AddressesPage();
		 
		 homeobj.clickaddress();
		signinobj.enteremail("jhon_cena22@gmail.com");
		signinobj.enterpasswordField("1234");
		signinobj.clicksignin();
		addressesobj.clicknewaddress();
		addressesobj.enterfirstName("Jhon");
		addressesobj.enterlastName("Cena");
		addressesobj.enterAddress1("2020 nw 10st miami florida 33120");
		addressesobj.enterCity("Miami");
		addressesobj.SelectStateDropDown("value", "FL");
		addressesobj.clickCountryRadio();
		addressesobj.enterAge("22");
	    addressesobj.enterPhone("123-2334-3434");
		addressesobj.clickDancing();
		addressesobj.enterNote("Automation is Fun");
		addressesobj.clickCreateAddress();
		addressesobj.clickList();
		
	
	}

}



/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

	
	
