package selenium.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	
	@Test
	
	public void PageAutomation() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver\\chromedriver.exe" );		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.khanacademy.org/");
		driver.getTitle();
		
		//checking login functionalities
		driver.findElement(By.cssSelector("#login-or-signup")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("manjulanair1801@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("maithili123");
		driver.findElement(By.cssSelector("button.button_1bv3901-o_O-common_1icufe0-o_O-large_10vyrhl-o_O-all_tca0ge > .inner_ed2ug6")).click();
				
		
	}

}
