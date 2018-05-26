package com.facebook.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSearchPage {
private WebDriver driver;
	
	/*Elementos*/
	WebElement searchTxt;
	WebElement searchBtn;
	
	
	/*Metodos*/
	
	public FacebookSearchPage(WebDriver driver2) {
		this.driver =driver2;
	}


	public void searchFriend (String name) {
		searchTxt = driver.findElement(By.name("q"));
		searchTxt.clear();
		searchTxt.sendKeys(name);
		searchBtn = driver.findElement(By.xpath("//button[@data-testid='facebar_search_button']"));
		searchBtn.click();	
		
	}

}
