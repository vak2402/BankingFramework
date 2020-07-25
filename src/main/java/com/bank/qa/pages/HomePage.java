package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//*[contains(text(),'Manger Id')]")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath="//*[text()='Manager']")
	@CacheLookup
	WebElement managerLink;
	
	@FindBy(xpath="//*[text()='New Customer']")
	@CacheLookup
	WebElement newCustomerLink;
	
	@FindBy(xpath="//*[text()='Edit Customer']")
	@CacheLookup
	WebElement editCustomerLink;
	
	@FindBy(xpath="//*[text()='Delete Customer']")
	@CacheLookup
	WebElement deleteCustomer;
	
	@FindBy(xpath="//*[text()='New Account']")
	@CacheLookup
	WebElement newAccount;
	
	@FindBy(xpath="//*[text()='Edit Account']")
	@CacheLookup
	WebElement editAccountLink;
	
	@FindBy(xpath="//*[text()='Delete Account']")
	@CacheLookup
	WebElement deleteAccountLink;
	
	@FindBy(xpath="//*[text()='Deposit']")
	@CacheLookup
	WebElement depositLink;
	
	@FindBy(xpath="//*[text()='Withdrawal']")
	@CacheLookup
	WebElement withdrawalLink;
	
	@FindBy(xpath="//*[text()='Fund Transfer']")
	@CacheLookup
	WebElement fundTransferLink;
	
	@FindBy(xpath="//*[text()='Change Password']")
	@CacheLookup
	WebElement changePasswordLink;
	
	@FindBy(xpath="//*[text()='Balance Enquiry']")
	@CacheLookup
	WebElement balalceEnquiryLink;
	
	@FindBy(xpath="//*[text()='Mini Statement']")
	@CacheLookup
	WebElement miniStatementLink;
	
	@FindBy(xpath="//*[text()='Customised Statement']")
	@CacheLookup
	WebElement customisedStatmentLink;
	
	@FindBy(xpath="//*[text()='Log out']")
	@CacheLookup
	WebElement logoutLink;
	
	//Initializing of the Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public String validateUserName() {
		return userNameLabel.getText();
	}
	
	public NewCustomerPage validateNewCustomerLink() {
		newCustomerLink.click();
		return new NewCustomerPage();
	}
}
