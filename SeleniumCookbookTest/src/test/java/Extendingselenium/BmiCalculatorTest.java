/*package Extendingselenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BmiCalculatorTest {

	private WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception {
	driver = new FirefoxDriver();
	}
	@Test
	public void testBmiCalculatorLayout() throws Exception {
	String scrFile = "c:\\screenshot.png";
	String baseScrFile = "c:\\baseScreenshot.png";
	
	driver.get("http://dl.dropbox.com/u/55228056/bmicalculator.html");
	File screenshotFile = ((TakesScreenshot) driver)
	.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile, new File(scrFile));
	
	assertEquals(CompareUtil.Result.Matched,CompareUtil.CompareImage(baseScrFile, scrFile));
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	driver.quit();
	}
}
*/