package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME 20')]")
	private WebElement version;
	//Initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public void verifyErrorMessage()
	{
		verifyElement(errMsg);
	}
	
	public void verifyingTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public  void verifyVersion(String eVersion)
	{
		try
		{
			System.out.println("From Excel"+eVersion);
			Assert.assertEquals(version.getText(), eVersion);
			Reporter.log("Version is matching",true);
		}
		catch(Exception e)
		{
			System.out.println("Version number does not match");
		}
	}
}
