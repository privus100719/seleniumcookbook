package WorkingWithSeleniumApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class JavaScriptcode {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
	}
	
	@Test
	public void testJavaScriptCalls() throws Exception {
	
	try {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String title = (String) js.executeScript("returndocument.title");
	assertEquals("Google", title);
	long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
	assertEquals(42, links);
	} finally {
	driver.quit();
	}
	}

	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
