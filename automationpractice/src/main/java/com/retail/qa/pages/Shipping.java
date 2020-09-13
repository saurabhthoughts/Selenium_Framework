package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class Shipping extends TestBase {
	@FindBy(xpath="//*[@id=\"cgv\"]")
	WebElement CheckBox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	WebElement Checkout3;
	
	@FindBy(xpath="//*[@id=\"order\"]/div[2]/div/div/div/div/p")
	WebElement TermsOfConditions;
	
	public Shipping() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CheckBox()
	{
		CheckBox.click();
	}
	public void Checkout3()
	{
		Checkout3.click();
	}
	

}
