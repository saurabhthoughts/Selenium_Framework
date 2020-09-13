package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.retail.qa.base.TestBase;

public class LoginMyStore extends TestBase {

	
	@FindBy(xpath="//*[@id=\"id_gender1\"]") 
	WebElement gender;
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	WebElement fName;
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	WebElement lName;
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"months\"]")
	WebElement dobm;
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement doby;
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement dobd;
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement signUpCb;
	@FindBy(xpath="//*[@id=\"optin\"]")
	WebElement signUpCbb;
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement company;
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"id_state\"]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"postcode\"]")
	WebElement postalcode;
	@FindBy(xpath="//*[@id=\"id_country\"]")
	WebElement country;
	@FindBy(xpath="//*[@id=\"other\"]")
	WebElement additionalInfo;
	@FindBy(xpath="//*[@id=\"phone\"]")
	WebElement homePhone;
	@FindBy(xpath="//*[@id=\"phone_mobile\"]")
	WebElement mobilePhone;
	@FindBy(xpath="//*[@id=\"alias\"]")
	WebElement alias;
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement submit;
	@FindBy(xpath="//*[@id=\"account-creation_form\"]/div[4]/p/span/text()")
	WebElement required;
	
	public LoginMyStore() 
	{
		PageFactory.initElements(driver, this);
	}
	public String validateTitle1()
	 {
		 return driver.getTitle();
	 }
	public boolean  click1()
	{
		gender.click();
		 return gender.isSelected();
		
	}
	public void fName()
	{
		fName.sendKeys("Saurabh");
	}
	public void lnNme()
	{
		lName.sendKeys("Pope");
	}
	
	public void password()
	{
		password.sendKeys("Sau@live123");
	}
	public void birthm()
	{
		Select s =new Select(dobm);
		s.selectByValue("8");
	}
	public void birthy()
	{
		Select s =new Select(doby);
		s.selectByValue("1996");
	}
	public void birthd()
	{
		Select s =new Select(dobd);
		s.selectByValue("17");
	}
	public void signUpCb()
	{
		signUpCb.click();
	}
	public void signUpCbb()
	{
		signUpCbb.click();
	}
	public void company()
	{

     company.sendKeys("Accenture");
	}
	public void address()
	{
		address.sendKeys("Blue Ridge Society/2502");
	}
	public void city()
	{
		city.sendKeys("Pune");
	}
	public void state()
	{
		Select s =new Select(state);
		s.selectByVisibleText("Florida");
	}
	public void postalcode()
	{
		postalcode.sendKeys("90001");
	}
	public void country()
	{
		Select s =new Select(country);
	}
	public void additionalInfo()
	{
		additionalInfo.sendKeys("not in usa now");
	}
	public void homePhone()
	{
		homePhone.sendKeys("8983639833");
	}
	public void mobilePhone()
	{
		mobilePhone.sendKeys("7020542334");
	}
	public void alias()
	{
		alias.sendKeys("in india");
	}
	public void submit()
	{
		submit.click();
	}
	public String gettext()
	{
		return required.getText();
		
	}
	
	
}
