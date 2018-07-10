package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class InvalidLoginTest extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		//user name
		String un=ExcelData.getData(input_path, "Login", 2, 0);
		
		//password
		String pwd=ExcelData.getData(input_path, "Login", 2, 1);
		
		//login page title
		String lpTitle=ExcelData.getData(input_path, "Login", 1, 2);
		
		LoginPage lp=new LoginPage(driver);
		
		//verify login page title
		lp.verifyingTitle(lpTitle);
		
		//enter invalid user name
		lp.enterUserName(un);
		
		//enter invalid password
		lp.enterPassword(pwd);
		
		//click on login button
		lp.clickOnLogin();
		
		//verify error message
		lp.verifyErrorMessage();
	}
}
