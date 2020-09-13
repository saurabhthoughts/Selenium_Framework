package com.retail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class OrderMyStore extends TestBase {


	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
	WebElement Cart;
	
	@FindBy(xpath="//*[@id=\"search_query_top\"]")
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	WebElement SearchClick;
	
	@FindBy(xpath="//*[@id=\"product_7_34_0_373050\"]/td[3]/span")
	WebElement Stock;
	
	@FindBy(xpath="//*[@id=\"7_34_0_373050\"]/i")
	WebElement Delete;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[2]/spani")
	WebElement Add;
	
	@FindBy(xpath="//*[@id=\"cart_quantity_down_7_34_0_373050\"]/span/i")
	WebElement Remove;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement PCheckout;
	
	public OrderMyStore() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PCheckout()
	{
		PCheckout.click();
	}
	public void Add()
	{
		Add.click();
	}
	
	
}
