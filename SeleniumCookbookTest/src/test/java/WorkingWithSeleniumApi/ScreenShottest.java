package WorkingWithSeleniumApi;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class ScreenShottest {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
	}

	
	@Test
	public void testTakesScreenshot() throws Exception {
	File scrFile = ((TakesScreenshot) driver)
	.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("C:\\Users\\rajve\\workspace\\Oxygen Workspace\\SeleniumCookbookTest\\Screenshot\\main_page.png"));
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
