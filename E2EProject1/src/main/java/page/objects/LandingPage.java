package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Academy.BasePage;

public class LandingPage extends BasePage {
	
	public WebDriver driver;
	By signin =By.cssSelector("#login-or-signup");
	
	
	public LandingPage(WebDriver driver) {
		this.driver =driver;
	}
	public WebElement getLogin()
	{
		return driver.findElement(signin);

	}

}