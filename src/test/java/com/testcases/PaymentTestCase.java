package com.testcases;

import java.io.IOException;

import com.pageobject.Login;
import com.pageobject.Payment;

public class PaymentTestCase extends BaseClass
{
	public void paymentTest() throws InterruptedException, IOException
	{
		Login login=new Login(driver);
		
		login.loginLink();
		
		login.userName(UserName);
		
		login.password(LoginPassword);
		
		login.submitButton();
		
		Payment payment=new Payment(driver);
		
		payment.paymentLink();
		
		logger.info("Clicked Payment Link");
		
		payment.contactListButton();
		
		payment.contactNames();
		
		logger.info("Selected Contact Name");
		
		payment.amount(Amount);
		
		logger.info("Entered Amount");
		
		payment.description(Description);
		
		logger.info("Entered Description");
		
		payment.nextButton();
		
		logger.info("Clicked Next Button");
		
		Thread.sleep(3000);
		
		payment.confirmButton();
		
		logger.info("Clicked Confirm Button");
		
		Thread.sleep(3000);
		
		payment.alertCloseButton();
		
		logger.info("Closed Message Box");
		
		BaseClass.captureScreenShot(driver, "paymentTest");
	}
}
