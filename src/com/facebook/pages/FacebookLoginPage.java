package com.facebook.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
	private WebDriver driver;

	/*Elementos*/
	WebElement fbLogoImg;
	WebElement emailTxt;
	WebElement passwordTxt;
	WebElement loginBtn;	


	public FacebookLoginPage(WebDriver driver2) {
		this.driver =driver2;

	}
	/*Metodos*/

	public void logIn( String user, String pass){
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"
)).click();
	}



}
