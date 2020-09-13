package com.retail.qa.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.mongodb.internal.connection.tlschannel.util.Util;
import com.retail.qa.base.TestBase;
import com.retail.qa.config.util;
import com.retail.qa.pages.HomePage;


public class HomePageTest extends TestBase {
	HomePage hp;
	util u;
	ExtentReports extent;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		initialization();
		u=new util();
		hp=new HomePage();
		extent=new ExtentReports();
	}  
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		u.report();
		extent.createTest("homepage");
		String title=hp.validateTitle();
		AssertJUnit.assertEquals(title, "My Store");
		
	}
	@Test(priority=2)
	public void SignInTest() throws InterruptedException
	{
       
		extent.createTest("homepage1");
		hp.click();
		Thread.sleep(5000);
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
