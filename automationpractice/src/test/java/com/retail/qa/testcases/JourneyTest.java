package com.retail.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.retail.qa.base.TestBase;
import com.retail.qa.config.util;
import com.retail.qa.pages.CreateAccount;
import com.retail.qa.pages.HomePage;
import com.retail.qa.pages.LoginMyStore;
import com.retail.qa.pages.MyAccMySto;
import com.retail.qa.pages.OrderMyStore;
import com.retail.qa.pages.OrderMyStore2;
import com.retail.qa.pages.Payment;
import com.retail.qa.pages.Shipping;

public class JourneyTest extends TestBase
{
	   util u;
	    ExtentReports extent;
		CreateAccount ca;
		HomePage hp;
		LoginMyStore lm;
		MyAccMySto ma;
		OrderMyStore os;
		OrderMyStore2 os2;
		Shipping s;
		Payment p;
		public JourneyTest(){
			super();
		}
		
		@BeforeMethod
	    public void setup()
		{
			initialization();
			extent=new ExtentReports();
			hp=new HomePage();
			ca=new CreateAccount();
			ma=new MyAccMySto ();
			ca=hp.click();
			p=new Payment();
			s=new Shipping();
			os=new OrderMyStore();
			os2=new OrderMyStore2();
			ca.emailAddress(prop.getProperty("email1"));
			ca.password();
			ca.signUp1();
			ma.home();
		}
		
		@Test(priority=1)
		public void AccountVerification() throws InterruptedException
		{
			extent.createTest("AccountVerification");
			ma.home();
			String name=hp.Identity();
		Thread.sleep(3000);
			Assert.assertEquals(name, "Saurabh Pope");
		}
		
		@Test(priority=2)
		public void ChiffonDress() throws InterruptedException {
			extent.createTest("Chiffon");
			hp.Journey();
			hp.checkout();
			os.PCheckout();
			os2.OCheckout();
			s.CheckBox();
			s.Checkout3();
			p.BankWire();
			p.ConfirmOrder();
			String order=p.SuccessfullOrder();
			Assert.assertEquals(order, "Your order on My Store is complete.");
			extent.flush();
			
		}
		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
		@AfterTest
		public void TearDown1() {
			driver.quit();
		}

}
