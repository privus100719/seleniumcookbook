/*package Extendingselenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObjectMapTest {

	private WebDriver driver;
	private ObjectMap map;
	
	@BeforeTest
	public void setUp() throws Exception {
	
	driver = new FirefoxDriver();
	driver.get("http:// cookbook.seleniumacademy.com/bmicalculator.html");
	}
	@Test
	public void testBmiCalculator() {
	
	map = new ObjectMap("src/test/resources/objectmap/objectmap.properties");
	
	WebElement height =
	driver.findElement(map.getLocator("height_field"));
	;
	height.sendKeys("181");

	WebElement weight =
	driver.findElement(map.getLocator("weight_field"));
	weight.sendKeys("80");
	
	WebElement calculateButton = driver.findElement(map.getLocator("calculate_button"));
	calculateButton.click();
	WebElement bmi =
	driver.findElement(map.getLocator("bmi_field"));
	assertEquals("24.4", bmi.getAttribute("value"));
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	driver.quit();
	}
}
*/