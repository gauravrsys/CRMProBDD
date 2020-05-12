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

public class ContactStepDef extends TestBase {
	
	public ContactPage cp;
	public HomePage hp;
	public ContactListPage clp;
	public LoginPage lp;
	
	public ContactStepDef() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		TestBase.initialization();
	}
	
	@Given("^user is on add new contact page$")
	public void user_is_on_add_new_contact_page()  {
		
		lp= new LoginPage();
		Utilities.StaticWait();
		hp= lp.login();
		driver.switchTo().frame("mainpanel");
		cp= hp.clickOnNewContact();
		boolean b3= driver.findElement(By.xpath("//input[@value='Load From Company']")).isDisplayed();
		Assert.assertTrue(b3);
	}

	@When("^user enters firstname and lastname and clicks on save button$")
	public void user_enters_firstname_and_lastname_and_clicks_on_save_button()  {
	    
		cp.addNewContact();
	}

	@Then("^new user should get added$")
	public void new_user_should_get_added() {
		
		clp= hp.clickOnContacts();
		boolean b4= driver.findElement(By.xpath("(//a[text()='user three'])")).isDisplayed();
		Assert.assertTrue(b4);
	    
	}
	
	@AfterClass
	public void closeBrowser() {
		
		Utilities.StaticWait();
		TestBase.tearDown();
	}

}
