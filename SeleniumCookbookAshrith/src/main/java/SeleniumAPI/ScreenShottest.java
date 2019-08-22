package SeleniumAPI;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShottest {
	
public WebDriver driver;
	
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
	public void testTakesScreenshot() throws Exception {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\firstpom\\Screenshots\\main_page.png"));
	}
	
	@AfterTest
	public void aftertest() {
		
		driver.close();
	}

}
