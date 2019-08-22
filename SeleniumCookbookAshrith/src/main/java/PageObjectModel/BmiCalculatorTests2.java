package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BmiCalculatorTests2 {
	
	
	private WebDriver driver;
	@BeforeClass
	public void setUp() {
		
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
	
	System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
	}

	@Test
	public void testBmiCalculation() throws InterruptedException
	{
	
	BmiCalcPage2 bmiCalcPage = new BmiCalcPage2();

	bmiCalcPage.load();

	bmiCalcPage.calculateBmi("181", "80");

	assertEquals("24.4", bmiCalcPage.getBmi());
	
	assertEquals("Normal", bmiCalcPage.getBmiCategory());
	
	bmiCalcPage.close();
	
	bmiCalcPage.tearDown();
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
		
	}
	
	

}
