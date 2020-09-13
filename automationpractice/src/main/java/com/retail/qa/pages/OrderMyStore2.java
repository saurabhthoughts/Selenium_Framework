package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class OrderMyStore2 extends TestBase {
	
	@FindBy (xpath="//*[@id=\"addressesAreEquals\"]")
	WebElement CheckBox;
	
	@FindBy (xpath="//*[@id=\"address_invoice_form\"]/a/span") 
	WebElement AddNewAdress;
	
	@FindBy (xpath="//*[@id=\"address_delivery\"]/li[8]/a/span") 
	WebElement UpdateDA;
	
	@FindBy (xpath="//*[@id=\"address_invoice\"]/li[8]/a/span") 
	WebElement UpdateBA;
	
	@FindBy (xpath="//*[@id=\"center_column\"]/form/div/p/a/span") 
	WebElement AddComment;
	
	@FindBy (xpath="//*[@id=\"center_column\"]/form/p/a") 
	WebElement ContinueSopping;
	@FindBy (xpath="//*[@id=\"center_column\"]/form/p/button/span") 
	WebElement OCheckout;
	
	@FindBy (xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]") 
	WebElement Cart3;
	
	public OrderMyStore2() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void OCheckout()
	{
		OCheckout.click();
	}
	
}
