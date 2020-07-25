package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class LoginPage extends TestBase{
	
//Page Factory or Object Repository
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement loginbutton;
	
	@FindBy(xpath="//*[text()='Guru99 Bank']")
	@CacheLookup
	WebElement loginText;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions or Methods
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String validateLoginPageText() {
		return loginText.getText();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage();
	}
}
