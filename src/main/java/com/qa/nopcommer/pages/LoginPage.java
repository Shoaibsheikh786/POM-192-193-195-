package com.qa.nopcommer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//1. Locators
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement login;
	
	//2. Methods will will deal with the above elements 
	
	public void enterEmail(String value)
	{
		email.sendKeys(value);
		
	}
	
	public void enterPasswrod(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterLogin()
	{
		login.click();
	}

	//3. create constructor so that we can use webElements 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
