package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BmiCalculatorTests 
{
	
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
	public void testBmiCalculation() {
	
	BmiCalcPage bmiCalcPage = new BmiCalcPage(driver);

	bmiCalcPage.setHeight("181");
	
	bmiCalcPage.setWeight("80");

	bmiCalcPage.calculateBmi();

	assertEquals("24.4", bmiCalcPage.getBmi());
	assertEquals("Normal", bmiCalcPage.getBmiCategory());
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
	Thread.sleep(10000);
	driver.quit();
	}

}
