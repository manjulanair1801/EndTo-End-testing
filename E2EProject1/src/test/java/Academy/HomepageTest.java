package Academy;

import org.testng.annotations.Test;

import page.objects.LandingPage;
import page.objects.LoginPage;
public class HomepageTest extends BasePage {
	
	@Test
	public void BasePagenavigation() throws Throwable {
		driver=intializedriver();
		driver.get("https://www.khanacademy.org/");
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp =new LoginPage(driver);
		lp.getEmail().sendKeys("manjulanair1801@gmail.com");
		lp.getPassword().sendKeys("maithili123");
		lp.getLogin().click();
		
		
		
		
	}

}
