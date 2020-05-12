package stepDefinition;

import org.openqa.selenium.By;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utility.Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef extends TestBase {
	
	public LoginPage lp;
	public HomePage hp;
	
	public LoginStepDef() {
		super();
		
	}
	
	@Before
	public void setUp() {
		
		TestBase.initialization();	
		//lp= new LoginPage();
	}
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()  {
		
		//TestBase.initialization();	
		
		boolean b1= driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).isDisplayed();
		Assert.assertTrue(b1);
	}

	@When("^user enters username and enters password and clicks on login button$")
	public void user_enters_username_and_enters_password_and_clicks_on_login_button() {
		
		lp= new LoginPage();
		Utilities.StaticWait();
		hp= lp.login();
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		
		String title = driver.getTitle();
		
		Assert.assertEquals("CRMPRO", title);
		TestBase.tearDown();
	    
	}
	
	@After
	public void closeBrowser() {
		
		TestBase.tearDown();
	}


}
