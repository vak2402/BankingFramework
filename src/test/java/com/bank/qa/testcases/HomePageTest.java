package com.bank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	
	public  HomePageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void verifyHomePageTitleTest() {
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
	}
	
	@Test(priority=1)
	public void verifyUserNameTest() {
		String userName=homePage.validateUserName();
		Assert.assertEquals(userName, "Manger Id : mngr267098");
	}
	@Test(priority=2)
	public void verifyNewCustomerLinkTest() {
		homePage.validateNewCustomerLink();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
