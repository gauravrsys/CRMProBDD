package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(xpath="//input[@value='Load From Company']")
	WebElement loadfromcompanybtn;
	
	@FindBy(xpath="//input[@value='Load From Company']//following-sibling::input[@value='Save']")
	WebElement savebtn;
	
	public ContactPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void addNewContact() {
		firstname.sendKeys("user");
		lastname.sendKeys("three");
		savebtn.click();
	}

}
