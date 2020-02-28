package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BAseTest {

	public WebDriver driver;
	@BeforeSuite()
	public void setapp()
	{
		WebDriverManager.chromedriver().version("73").setup();
	}
	@BeforeMethod
	public void openbrowser()
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.spencers.in/");
	}
//	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.close();
//	}
	

}
