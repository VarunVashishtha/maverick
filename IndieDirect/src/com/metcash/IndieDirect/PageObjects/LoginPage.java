package com.metcash.IndieDirect.PageObjects;

import org.openqa.selenium.WebDriver;

import com.metcash.IndieDirect.Genericfunctions.GenericFunctions;
public class LoginPage {
	public WebDriver driver;
	GenericFunctions generic;
	public LoginPage(WebDriver driver,GenericFunctions generic)
	{
		this.driver=driver;
		this.generic = generic;
	}
	//Locators
	public static final String username_txt = "//*[@id='j_username']";
	public static final String password_txt = "//*[@id='j_password']";
	public static final String login_btn = "//*[@id='signIn']";
	
	
	


}
