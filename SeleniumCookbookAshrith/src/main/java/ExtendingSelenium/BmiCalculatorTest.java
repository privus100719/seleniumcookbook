package ExtendingSelenium;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BmiCalculatorTest {
	
	private WebDriver driver;
	
	@BeforeTest
	
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe.");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dl.dropbox.com/u/55228056/bmicalculator.html");
		
		
		
		
	}
	
	@Test
	
	public void testBmiCalculatorLayout() throws Exception 
	{
		
		driver.findElement(By.xpath("//a[text()='Get a free account']")).click();
		
	String scrFile = "C:\\ScreenShots.png";
	
	String baseScrFile = "C:\\baseScreenShots.png";
	
	
	
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshotFile, new File(scrFile));
	
	assertEquals(CompareUtil.Result.Matched,CompareUtil.CompareImage(baseScrFile, scrFile));
	}
	
	@AfterTest
	public void tearDown()  {
		
	driver.close();
	}

}
