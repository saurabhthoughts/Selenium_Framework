package com.retail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retail.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	WebElement SignIn;
	
	@FindBy(xpath="//*[contains(text(),'Saurabh Pope')]")
	WebElement Identity;
	
	@FindBy(xpath="//*[contains(text(),'Printed Chiffon Dress')]")
	WebElement ChiffonDress;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span")
	WebElement Cart;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement Tshirt;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement Dresses;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement Women;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
	WebElement CasualDresses;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
	WebElement SignOut;
	
	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	WebElement Contacts;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement Checkout;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	 public String validateTitle()
	 {
		 return driver.getTitle();
	 }
	 public CreateAccount click()
	 {
		 SignIn.click();
		 return new CreateAccount();
	 }
	 public String Identity()
	 {
		 return Identity.getText();
	 }
	 
	 public void Journey() throws InterruptedException
	 {
		 Actions a=new Actions(driver);
		 a.moveToElement(ChiffonDress).build().perform();
		 Thread.sleep(3000);
		 Cart.click();
     }
	 public void checkout()
	 {
		 Checkout.click();
     }
	
}
