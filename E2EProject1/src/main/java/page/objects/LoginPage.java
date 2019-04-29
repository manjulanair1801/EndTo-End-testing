package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Academy.BasePage;

public class LoginPage extends BasePage {
	
	public WebDriver driver;
	By login=By.cssSelector("input[type='text']");
	By password = By.cssSelector("input[type='password']");
	By logintab = By.xpath("//div[.='Log in']");
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	}
	public WebElement getEmail()
	{
		return driver.findElement(login);

	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(logintab);
	}
	}