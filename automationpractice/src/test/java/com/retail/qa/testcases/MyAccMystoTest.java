package com.retail.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.retail.qa.base.TestBase;
import com.retail.qa.pages.CreateAccount;
import com.retail.qa.pages.HomePage;
import com.retail.qa.pages.MyAccMySto;

public class MyAccMystoTest extends TestBase {
	CreateAccount ca;
	HomePage hp;
	MyAccMySto ma;
	ExtentReports extent;
	MyAccMystoTest mt;
	public MyAccMystoTest(){
		super();
	}
	
	@BeforeMethod
    public void setup()
	{
		initialization();
		hp=new HomePage();
		ca=new CreateAccount();
		ma=new MyAccMySto ();
		extent=new ExtentReports();
		ca=hp.click();
		ca.emailAddress(prop.getProperty("email"));
		ca.password();
		ca.signUp1();
	}
	
	@Test(priority=1)
	public void Titletest2()
	{extent.createTest("title2");
		String title=ma.validateTitle1();
		Assert.assertEquals(title, "My account - My Store");
	}
	@Test(priority=2)
	public void AccountVerification()
	{
		extent.createTest("title3");
		ma.home();
		String name=hp.Identity();
		Assert.assertEquals(name, "Saurabh Pope");
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

