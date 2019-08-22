package SynchronizingTests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicitlyWaitTest {
	
	@Test
	public void testWithImplicitWait() {
		
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
	WebDriver driver = new FirefoxDriver();

	driver.get("http://cookbook.seleniumacademy.com/AjaxDemo.html");
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {

	driver.findElement(By.linkText("Page 4")).click();
	
	
	WebElement message = driver.findElement(By.id("page4"));
	assertTrue(message.getText().contains("Nunc nibh tortor"));
	} 
	
	finally {
	driver.quit();
	
	}
	
	}

}
