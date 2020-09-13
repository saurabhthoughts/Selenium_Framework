package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class Payment extends TestBase {
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")
	WebElement BankWire;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")
	WebElement Check;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	WebElement ConfirmOrder;
	
	@FindBy(xpath="//*[contains(text(),'Your order on My Store is complete.')]")
	WebElement SuccessfullOrder;
	
	public Payment() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void BankWire()
	{
		BankWire.click();
	}
	
	public void ConfirmOrder()
	{
		ConfirmOrder.click();
	}
	
	public String SuccessfullOrder()
	{
		return SuccessfullOrder.getText();
		
	}
	
}
