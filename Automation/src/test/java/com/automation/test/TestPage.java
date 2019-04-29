package com.automation.test;

import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pages.HomePage;

public class TestPage extends BaseClass {
	
	
	@Test
	public void PageNavigation() throws Throwable {
		driver = initializedriver();
		driver.get("https://www.khanacdemy.org/");
		HomePage h = new HomePage(driver);
		h.signin().click();
		
		
		
	}
	

}
