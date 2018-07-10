package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;
import com.actitime.tests.BaseTest;

@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest
{
	@Test
	public void testValidLoginLogout()
	{
		//username
		String un=ExcelData.getData(input_path, "Login", 1, 0);
		
		//password
		String pwd = ExcelData.getData(input_path, "Login", 1, 1);
		
		//login page title
		String lptitle=ExcelData.getData(input_path, "Login", 1, 2);
		
		//enter time track title
		String eptitle=ExcelData.getData(input_path, "EnterTimeTrack", 1, 0);
		
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//verify login page title
		lp.verifyingTitle(lptitle);
		
		//Enter valid username
		lp.enterUserName(un);
		
		//Enter valid password
		lp.enterPassword(pwd);
		
		//click on login
		lp.clickOnLogin();
		
		//verify enter time track page title
		lp.verifyingTitle(eptitle);
		
		//click on logout
		ep.clickOnLogout();
		
		//verify login page title
		lp.verifyingTitle(lptitle);
	}
}
