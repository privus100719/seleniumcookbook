package DataDrivenTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDDT {
	
	private WebDriver driver;
	@DataProvider
	public Object[][] testData() {
	return new Object[][] {
	new Object[] { "160", "45", "17.6", "Underweight"},
	new Object[] { "168", "70", "24.8", "Normal" },
	new Object[] { "181", "89", "27.2", "Overweight" },
	new Object[] { "178", "100", "31.6", "Obesity" }, };
	}
	
	@BeforeTest
	public void setUp() {
	
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
	}
	
	@Test(dataProvider = "testData")
	public void testBMICalculator(String height, String weight, String bmi,String category) {
	WebElement heightField =
	driver.findElement(By.name("heightCMS"));
	heightField.clear();
	heightField.sendKeys(height);
	WebElement weightField =
	driver.findElement(By.name("weightKg"));
	weightField.clear();
	weightField.sendKeys(weight);
	WebElement calculateButton =
	driver.findElement(By.id("Calculate"));
	calculateButton.click();
	WebElement bmiLabel = driver.findElement(By.name("bmi"));
	assertEquals(bmiLabel.getAttribute("value"), bmi);
	WebElement bmiCategoryLabel = driver.findElement(By.name("bmi_category"));
	
	assertEquals(bmiCategoryLabel.getAttribute("value"),category);
	
	}
	
	@AfterTest
	public void tearDown() {
	driver.quit();
	}
	

}
