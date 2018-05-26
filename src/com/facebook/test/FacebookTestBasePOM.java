package com.facebook.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.facebook.pages.FacebookLoginPage;
import com.facebook.pages.FacebookSearchPage;

public class FacebookTestBasePOM {
	private static String DRIVER_PROPERTY ="webdriver.chrome.driver";
	private static String DRIVER_PATH ="C:\\test_automation\\drivers\\chromedriver.exe";
	
	private static WebDriver driver;
	private static WebDriverWait driverWait;
	protected FacebookLoginPage login;
	protected FacebookSearchPage search;
	//protected AddFriendPage friend;
	
	
	@Before
	public void setup() {
		System.setProperty(DRIVER_PROPERTY, DRIVER_PATH);  //propiedad explorador chrome		
		driver = new ChromeDriver();  //driver de chrome
		driver.get("https://www.facebbok.com");
		login = new FacebookLoginPage (driver);
		search = new FacebookSearchPage (driver);
		//friend = new AddFriendPage(driver);
		
	}
	
	@Test
	public void searchFriendTestCase() {
		
	}
	
	@After
	public void closePage() {
		driver.quit ();
		
	}
	

}
