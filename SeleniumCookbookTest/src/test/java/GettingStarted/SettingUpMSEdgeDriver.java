package GettingStarted;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SettingUpMSEdgeDriver {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.edge.driver", "Drivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	@Test
	public void settingupEdgedriver()
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@AfterTest
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
