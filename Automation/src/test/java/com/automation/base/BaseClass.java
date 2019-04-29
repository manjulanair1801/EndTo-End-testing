package com.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
		Properties prop;
		public  WebDriver driver;
		FileInputStream fls;
		
	public WebDriver initializedriver() throws Throwable {
		fls=new FileInputStream("C:\\Users\\manju\\EclipseWorkspace1\\Automation\\src\\test\\resources\\resources\\Properties\\data.propertie");
		prop = new Properties();
		prop.load(fls);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\EclipseWorkspace1\\Automation\\src\\test\\resources\\resources\\Drivers\\chromedriver.exe");
		return driver = new ChromeDriver();
		
		}
		
	}


