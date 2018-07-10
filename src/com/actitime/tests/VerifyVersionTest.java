package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test
	public void testVerifyVersion()
	{
		//login page title
		String lpTitle=ExcelData.getData(input_path, "Login", 1, 2);
		
		//Version
		String version=ExcelData.getData(input_path, "Login", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		
		//verify login page title
		lp.verifyingTitle(lpTitle);
		
		//verify version
		lp.verifyVersion(version);
	}
}
