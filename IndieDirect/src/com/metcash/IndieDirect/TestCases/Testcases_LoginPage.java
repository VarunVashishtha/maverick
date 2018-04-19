package com.metcash.IndieDirect.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.metcash.IndieDirect.Genericfunctions.GenericFunctions;
import com.metcash.IndieDirect.PageObjects.LoginPage;

public class Testcases_LoginPage  {
	String browserType = "Chrome";
	WebDriver driver;
	GenericFunctions generic;

	@BeforeMethod
	@Parameters({ "browserType" })
	public void Before(){
		generic = new GenericFunctions(driver);
		driver = generic.StartDriver(browserType);
		driver.manage().window().maximize();
	}
	@AfterTest()
	public void aftertest()
	{
		driver.quit();
	}
	@Test
	//To verify that 
	public void TC01()
	{
		driver.get("https://localhost:9002/retailers/login");
		driver.findElement(By.xpath(LoginPage.username_txt)).sendKeys("customer1@test.com");
		driver.findElement(By.xpath(LoginPage.password_txt)).sendKeys("12341234");
		driver.findElement(By.xpath(LoginPage.login_btn)).click();
	}
	
}


