package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public WebDriver driver;
	public static  FileInputStream fls;
	public Properties prop;
	
	public WebDriver intializedriver() throws Throwable {
	fls=new FileInputStream("C:\\Users\\manju\\EclipseWorkspace1\\E2EProject1\\src\\test\\resources\\Properties\\data.properties");
	;
	 prop = new Properties ();
	 prop.load(fls);
	 
	 //String browsername = prop.getProperty("browser");

//if(browsername.equals("chrome"))
//	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver\\chromedriver.exe" );
		  driver =new ChromeDriver();
	 //System.setProperty("webdriver.chrome.driver", "C://Users//manju//EclipseWorkspace1//E2EProject1//src//test//resources//Drivers//chromedriver.exe");
	 
//	 }
	return driver;
}
}