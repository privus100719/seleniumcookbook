package SeleniumAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class WebdriverEvent {
	
	private WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception {
		
		 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://bit.ly/1DbdhsW");
	    
	}
	
	@Test
	public void testEventFiringWebDriver() throws Exception {
		
		
		driver.findElement(By.xpath("//a[text()='Get a free account']")).click();
		
	}
		
	/*EventFiringWebDriver eventDriver =new EventFiringWebDriver(driver);
	
	MyListener myListener = new MyListener();
	
	eventDriver.register(myListener);
	
	eventDriver.get("http://bit.ly/1DbdhsW");
	
	eventDriver.findElement(By.xpath("//a[text()='Get a free account']")).click();
	}
	*/
	
	@AfterTest
	public void tearDown() throws Exception {
	driver.close();
	}

}
