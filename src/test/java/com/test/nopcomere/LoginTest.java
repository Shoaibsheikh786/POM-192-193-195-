package com.test.nopcomere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nopcommer.pages.LoginPage;

public class LoginTest {
	
	
	WebDriver driver;
	LoginPage lp;   
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}
	
	
	@Test
	public void checkLoginWithInvalidCre()
	{
		lp=new LoginPage(driver);
		lp.enterEmail("jhon@gmail.com");
		lp.enterPasswrod("hello@123");
		lp.enterLogin();
		
		String str=driver.getTitle();
		Assert.assertEquals(str, "nopCommerce demo store. Logout");
		
	}

}
