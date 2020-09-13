package com.retail.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

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

public class LoginMyStoreTest extends TestBase {
    util u;
	CreateAccount ca;
	HomePage hp;
	LoginMyStore lm;
	ExtentReports extent;
	MyAccMySto ma;
	public LoginMyStoreTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		hp=new HomePage();
		extent=new ExtentReports();
		lm=new LoginMyStore();
		ca=new CreateAccount();
		u=new util();
		ca=hp.click();
		
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void titleTest()
	{
		extent.createTest("LoginMystore");
		String title=lm.validateTitle1();
		Assert.assertEquals(title, "Login - My Store");
	}
	@Test (priority=2)
	public void genderTest() throws InterruptedException
	{
		extent.createTest("GenderTest");
		lm.click1();
		Thread.sleep(2000);
		Assert.assertTrue(true);
	}
	@Test (priority=3)
	public void fNameTest() throws InterruptedException, IOException
	{
		extent.createTest("SignUp");
		ca.email(prop.getProperty("email"));
		ca.click();
		lm.fName();
		lm.lnNme();
		lm.city();
		lm.password();
		lm.address();
		lm.postalcode();
		lm.additionalInfo();
		lm.homePhone();
		lm.mobilePhone();
		lm.alias();
		lm.birthm();
		lm.birthy();
		lm.birthd();                               
		lm.state();
        lm.submit();
        Thread.sleep(5000);
        u.screenshot();
        Thread.sleep(10000);
	}
	
	@Test(priority=4)
	public void signUpTest()
	{
		extent.createTest("login2");
		ca.emailAddress(prop.getProperty("email"));
		ca.password();
		ca.signUp1();
				
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
