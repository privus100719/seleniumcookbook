/*package WorkingWithSeleniumApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebdriverEvent {
	
	private WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	}
	
	@Test
	public void testEventFiringWebDriver() throws Exception {
	EventFiringWebDriver eventDriver =new EventFiringWebDriver(driver);
	MyListener myListener = new MyListener();
	eventDriver.register(myListener);
	eventDriver.get("http://bit.ly/1DbdhsW");
	eventDriver.findElement(By.id("q")).sendKeys("Selenium Testing Tools Cookbook");
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
	driver.quit();
	}
}
*/