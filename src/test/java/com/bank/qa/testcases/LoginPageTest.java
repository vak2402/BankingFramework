package com.bank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initization();
		//LoginPage class objects
		loginPage=new LoginPage();
	}
	
	@Test(priority=0)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page");
	}
	
	@Test(priority=1)	
	public void loginPageTextTest() {
		String loginText=loginPage.validateLoginPageText();
		Assert.assertEquals(loginText, "Guru99 Bank");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
