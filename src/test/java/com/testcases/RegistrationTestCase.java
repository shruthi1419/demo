package com.testcases;

import java.io.IOException;


import com.pageobject.Registration;

public class RegistrationTestCase extends BaseClass
{
	public void registrationTest() throws InterruptedException, IOException
	{
		Registration register=new Registration(driver);
		
		register.registerLink();
		
		logger.info("Clicked on Register Link");
		
		register.name(Name);
		
		logger.info("Entered Name");
		
		register.loginName(LoginName);
		
		logger.info("Entered Login Name");
		
		register.email(Email);
		
		logger.info("Entered Email");
		
		register.website(Website);
		
		logger.info("Entered Website");
		
		Thread.sleep(1500);
		
		register.gender();
		
		register.businessTypeDropdown();
		
		Thread.sleep(2000);
		
		register.businessType();
		
		logger.info("Selected Business Type");
		
		register.defineAddressToggleButton();
		
		Thread.sleep(1500);
		
		register.address(Address);
		
		logger.info("Entered Address");
		
		register.zipCode(Zipcode);
		
		logger.info("Entered Zip Code");
		
		register.city(City);
		
		logger.info("Entered City");
		
		register.state(State);
		
		logger.info("Entered State");
		
		register.countryDropdown();
		
		Thread.sleep(2000);
		
		register.country();
		
		logger.info("Selected Country");
		
		register.nextButton();
		
		logger.info("Clicked on Next Button");
		
		Thread.sleep(2000);
		
		register.password(Password);
		
		logger.info("Entered Password");
		
		register.confirmPassword(ConfirmPassword);
		
		logger.info("Entered Confirm Password");
		
		register.tcCheckbox();
		
		logger.info("Clicked on Terms & Conditions Checkbox");
		
		Thread.sleep(18000);
		
		register.submitButton();
		
		logger.info("Clicked on Submit Button");
		
		logger.info("Registration Done Successfully");
		
		BaseClass.captureScreenShot(driver, "registrationTest");
	}
}
