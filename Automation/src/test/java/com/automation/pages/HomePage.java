package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.base.BaseClass;

public class HomePage extends BaseClass{
	
	public WebDriver driver;
	By login = By.cssSelector("#login-or-signup");
	
	public HomePage (WebDriver driver ) {
		this.driver = driver ;
	}
		
		
	public WebElement signin() {
			return driver.findElement(login);
	}
}
	


