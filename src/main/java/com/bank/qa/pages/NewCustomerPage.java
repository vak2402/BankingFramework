package com.bank.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class NewCustomerPage extends TestBase{

	//Page Factory or Object Repository
	@FindBy(name="name")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(name="rad1")
	@CacheLookup
	List<WebElement> radioBtnSelectGender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement dateofBirth;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement pin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement mobileNumber;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submitButton;
	
	//Initializing the Page Objects
	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void validateCreateNewCustomer(String custName, String gender, String dob, String address, String city, String state, String pin, String mobno, String emailid, String pwd) {
		customerName.sendKeys(custName);
		if (gender=="Male") 
			radioBtnSelectGender.get(0).click();
		else
			radioBtnSelectGender.get(1).click();
		dateofBirth.sendKeys(dob);
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.pin.sendKeys(pin);
		mobileNumber.sendKeys(mobno);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		submitButton.click();
	}
}
