package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class CreateAccount extends TestBase{
	
	@FindBy(xpath="//*[@id=\"email_create\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement signUp1;
	
	@FindBy(xpath="//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement forgetpw;
	
	public CreateAccount() {
		PageFactory.initElements(driver,this);
	}
	public String validateTitle()
	 {
		 return driver.getTitle();
	 }
	
	public void email(String e)
	{
	email.sendKeys(e);	
	
	}
	
	public LoginMyStore click()
	 {
		 submit.click();
		 return new LoginMyStore();
	 }
	
	public void emailAddress(String b)
	{
		emailAddress.sendKeys(b);
	}
	
	public void password()
	{
		password.sendKeys("Sau@live123");
	}
	
	public void signUp1()
	{
		signUp1.click();
	}


}
