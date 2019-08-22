package SeleniumAPI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
		
		driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/DragDropDemo.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testDragDrop() {
	
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	Actions builder = new Actions(driver);
	builder.dragAndDrop(source, target) .perform();
	assertEquals("Dropped!", target.getText());
	}

	@AfterTest
	public void aftertest()
	{
		driver.close();
	}

}
