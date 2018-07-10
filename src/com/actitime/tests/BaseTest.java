package com.actitime.tests;

import com.actitime.generic.AutoConst;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest implements AutoConst
{
	public static WebDriver driver;
	
	@BeforeClass
	public void preCondition()
	{
		System.setProperty(Chrome_Key, Chrome_Value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	
	/*@BeforeMethod
	public void preCondition()
	{
		URL url = new URL("C:\Node");
	}*/

	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}

}
