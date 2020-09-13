package com.retail.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
 public TestBase() {
	 
	 
		 try{prop=new Properties();
		 FileInputStream fis=new FileInputStream("C:\\Users\\Saurabh\\eclipse-workspace\\automationpractice\\src\\main\\java\\com\\retail\\qa\\config\\config.properties");
		 prop.load(fis);
		 }
		 catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }
		catch(Exception e) {
			e.printStackTrace();
		}
		 
 }
 
public static void initialization(){
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
	 
 }
 
	
	


