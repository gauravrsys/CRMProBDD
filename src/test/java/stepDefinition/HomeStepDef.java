package stepDefinition;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import com.crm.base.TestBase;
import com.crm.pages.ContactListPage;
import com.crm.pages.ContactPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utility.Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomeStepDef extends TestBase {
	
	public HomePage hp;
	public ContactPage cp;
	public LoginPage lp;
	public ContactListPage clp;
	
	public HomeStepDef() {
		
		super();
	}
	
	@BeforeClass
	public void setUp() {
		
		TestBase.initialization();
		/*lp= new LoginPage();
		Utilities.StaticWait();
		hp= lp.login();*/
	}
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage()  {
		
		lp= new LoginPage();
		Utilities.StaticWait();
		hp= lp.login();
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
	    
	}
	
	@When("^user clicks on contacts menu$")
	public void user_clicks_on_contacts_menu()  {
		
		driver.switchTo().frame("mainpanel");
		clp= hp.clickOnContacts();
	    
	}

	@Then("^user should navigated to contact list page$")
	public void user_should_navigated_to_contact_list_page()  {
		
		boolean b2= driver.findElement(By.xpath("//a[text()='Gaurav Agnihotri']")).isDisplayed();
		Assert.assertTrue(b2);
	    
	}


	@When("^user clicks on new contact under contacts menu$")
	public void user_clicks_on_new_contact_under_contacts_menu() {
	    
		driver.switchTo().frame("mainpanel");
		cp= hp.clickOnNewContact();
	}

	@Then("^user should navigated to add new contact page$")
	public void user_should_navigated_to_add_new_contact_page()  {
	    
			boolean b1= driver.findElement(By.xpath("//input[@value='Load From Company']")).isDisplayed();
			Assert.assertTrue(b1);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		TestBase.tearDown();
	}



}
