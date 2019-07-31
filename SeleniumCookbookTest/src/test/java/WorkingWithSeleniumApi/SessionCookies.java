package WorkingWithSeleniumApi;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SessionCookies {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.magentocommerce.com/");
		
	}
	
	
	@Test
	public void testCookies() {
	
	Select language = new Select(driver.findElement(By.id("select-language")));
	
	assertEquals("English",
	language.getFirstSelectedOption().getText());
	
	Cookie storeCookie = driver.manage().getCookieNamed("store");
	assertEquals(null, storeCookie);
	
	language.selectByVisibleText("French");

	storeCookie = driver.manage().getCookieNamed("store");
	assertEquals("french", storeCookie.getValue());
	}

}
