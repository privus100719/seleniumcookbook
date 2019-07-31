/*package Extendingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableTests {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
	
	driver = new FirefoxDriver();
	driver.get("http:// cookbook.seleniumacademy.com/Locators.html");
	}
	
	@Test
	public void testWebTableTest() {
	
	WebTable table = new WebTable(driver.findElement(By.cssSelector("div.cart-info table")));
	
	assertEquals(3, table.getRowCount());

	assertEquals(5, table.getColumnCount());
	
	assertEquals("iPhone", table.getCellData(3, 1));
	
	WebElement cellEdit = table.getCellEditor(3, 3, 0);
	cellEdit.clear();
	cellEdit.sendKeys("2");
	}
	@AfterTest
	public void tearDown() {
	
	driver.quit();
	}
}
*/