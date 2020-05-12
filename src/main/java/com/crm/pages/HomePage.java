package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactsmenu;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement newcontact;
	
	@FindBy(name="mainpanel")
	WebElement framename;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ContactPage clickOnNewContact() {
		
		Actions a= new Actions(driver);
		a.moveToElement(contactsmenu).build().perform();
		newcontact.click();
		return new ContactPage();
		
	}
	
	public ContactListPage clickOnContacts() {
		
		contactsmenu.click();
		return new ContactListPage();
	}

}
