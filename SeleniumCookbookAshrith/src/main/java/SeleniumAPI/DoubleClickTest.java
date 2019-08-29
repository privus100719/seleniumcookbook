package SeleniumAPI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickTest {
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void beforetest() {
		
		 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
		
	}
	
	@Test
	
	public void doubleClick() {
		
	
	WebElement message = driver.findElement(By.id("message"));

	assertEquals("rgba(0, 0, 255, 1)",message.getCssValue("background-color"));
	
	Actions builder = new Actions(driver);
	
	builder.doubleClick(message).perform();

	assertEquals("rgba(255, 255, 0, 1)",message.getCssValue("background-color"));
	  
	}
	
	@Test(enabled = false)
	
	public void contestmemu() {
		
		WebElement clickMeElement =driver.findElement(By.cssSelector("div.context-menuone.box.menu-1"));
		
				WebElement editMenuItem =driver.findElement(By.cssSelector("li.context-menuitem.icon-edit"));
				
				Actions builder = new Actions(driver);
				
				builder.contextClick(clickMeElement).moveToElement(editMenuItem).click().perform();
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				
				Alert alert = wait.until(ExpectedConditions.alertIsPresent());
				
				assertEquals("clicked: edit", alert.getText());
				
				alert.dismiss();
				}
	
	@AfterTest
	
	public void aftertest() {
		
		driver.close();
	}
}