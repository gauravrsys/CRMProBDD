package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.utility.Utilities;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@name='username']")
	WebElement unbox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwdbox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login() {
		
		unbox.sendKeys(prop.getProperty("un"));
		pwdbox.sendKeys(prop.getProperty("pwd"));
		loginbtn.click();
		return new HomePage();

	}
	
	
		
	}


