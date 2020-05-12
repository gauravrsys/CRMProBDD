package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.utility.Utilities;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		prop= new Properties();
		try {
			FileInputStream fis= new FileInputStream("/media/gaurav/BA92AE4892AE0949/ReloadOne/CRMProBDD/src/main/java/com/crm/config/config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				
			}
		} catch (FileNotFoundException e) {
		}

	}
	
	public static void initialization() {
		
		if (prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
			driver= new ChromeDriver();
		}
		
		else if(prop.getProperty("browser").equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefox"));
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public static void tearDown() {
		
		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
		driver.quit();
	}

}
