package ExtendingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Maps;

/*import org.junit.*;
import static org.junit.Assert.assertEquals;*/
import static org.testng.Assert.assertEquals;

public class Objectmaptest 
{
	
	private WebDriver driver;
	private Objectmaptest map;
	
	
	

	@BeforeTest
	
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe.");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		
		
	}
	
	@Test
	
	public void testBmiCalculator() {
		
		
		Objectmaptest map = new Objectmaptest();
		
		
		
		WebElement height = driver.findElement(By.className("height_field"));
		
		height.sendKeys("181");
				
		WebElement weight = driver.findElement(By.className("weight_field"));
		
		weight.sendKeys("80");
				
				
		WebElement calculateButton = driver.findElement(By.className("calculate_button"));
				
		calculateButton.click();
				
		WebElement bmi = driver.findElement(By.className("bmi_field"));
				
		assertEquals("24.4", bmi.getAttribute("value"));
				}
	
	
				
				@AfterTest
				public void tearDown() throws Exception {
					
				driver.close();	
				driver.quit();
				}
}
