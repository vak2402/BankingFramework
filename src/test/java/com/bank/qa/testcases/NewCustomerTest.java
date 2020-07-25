package com.bank.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.LoginPage;
import com.bank.qa.pages.NewCustomerPage;
import com.bank.qa.util.TestUtil;

public class NewCustomerTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	NewCustomerPage newCusomerPage;
	TestUtil testUtil;
	String sheetName= "NewCustomer";
	
	public NewCustomerTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initization();
		loginPage = new LoginPage();
		//homePage = new HomePage();
		//newCusomerPage = new NewCustomerPage();
		//testUtil = new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCusomerPage=homePage.validateNewCustomerLink();
	}
	
	@DataProvider
	public Object getNewCustomerData() {
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=0, dataProvider="getNewCustomerData")
	public void verifyCreateNewCustomerTest(String custName, String gender, String dob, String Stringaddress, String city, String state, String pin, String mobno, String emailid, String pwd) {
		newCusomerPage.validateCreateNewCustomer(custName, gender, dob, Stringaddress, city, state, pin,  mobno, emailid, pwd);
		driver.switchTo().alert().accept();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
