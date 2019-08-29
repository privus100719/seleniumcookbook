package SynchronizingTests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	
WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		
		 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
		
	@Test
	public void test01()
	{
		
	
		 WebElement element = driver.findElement(By.name("q"));
		 element.sendKeys("Selenium");
		 element.click();
		 
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")).click();
		
		
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.titleContains("Selenium - Google Search"));
	
		 assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
		
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
		
	}
}
