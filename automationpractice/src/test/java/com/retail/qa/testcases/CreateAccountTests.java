package com.retail.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.retail.qa.base.TestBase;
import com.retail.qa.pages.CreateAccount;
import com.retail.qa.pages.HomePage;

public class CreateAccountTests extends TestBase {
	ExtentReports extent;
	CreateAccount ca;
	HomePage hp;
	
	public CreateAccountTests()
{
		super();
}
@BeforeMethod
public void SetUp() {
	
	initialization();
	extent=new ExtentReports();
	hp=new HomePage();
	ca=hp.click();
}


@Test(priority=1)
public void caTitleTest()
{
    extent.createTest("Title2");
	String title=ca.validateTitle();
	AssertJUnit.assertEquals(title, "Login - My Store");
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
