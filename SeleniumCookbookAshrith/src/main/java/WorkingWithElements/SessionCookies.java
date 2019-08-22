package WorkingWithElements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import okhttp3.Cookie;

public class SessionCookies {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.magentocommerce.com/");
		
	}
	
	
	@Test(enabled=false)
	public void testCookies() {
		
	//driver.findElement(By.)s

	Select language = new Select(driver.findElement(By.xpath("//div[@class='js-current-lang current-lang']")));
			
	   //("js-current-lang current-lang")));
	
	assertEquals("English",language.getFirstSelectedOption().getText());
	
	org.openqa.selenium.Cookie storeCookie = driver.manage().getCookieNamed("store");
	
	assertEquals(null, storeCookie);
	
	language.selectByVisibleText("French");

	storeCookie = (org.openqa.selenium.Cookie) driver.manage().getCookieNamed("store");
	
	assertEquals("french", storeCookie);
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}


}
