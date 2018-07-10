package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager2");
		driver.findElement(By.id("loginButton")).click();
		/*WebDriverWait wt = new WebDriverWait(driver,10);
		WebElement eT=wt.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//span[contains(.,'invalid')]")));
		*/
		Thread.sleep(5000);
		WebElement eT=driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		String aTitle="Username or Password is invalid. Please try again.";
		String eTitle=eT.getText();
		if(eTitle.equals(aTitle))
			System.out.println("error message OK");
		else
			System.out.println("NOT OK");
		String ver=driver.findElement(By.xpath("//nobr[contains(.,'actiTIME 20')]")).getText();
		String aVer="actiTIME 2017.4";
		if(ver.equals(aVer))
			System.out.println("OK");
		else
			System.out.println("NOT OK");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("logoutLink")).click();
	}

}
