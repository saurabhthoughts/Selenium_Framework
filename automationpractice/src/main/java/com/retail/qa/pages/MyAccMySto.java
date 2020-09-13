package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class MyAccMySto extends TestBase {
	
	@FindBy(xpath="//*[@id=\"columns\"]/div[1]/a/i")
	WebElement home;
	       
	
	public MyAccMySto() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle1()
	 {
		 return driver.getTitle();
	 }

	public void home()
	 {
		 home.click();
		
	 }
}
