package ExtendingSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class WebTableTest {
	
	WebDriver driver;
	
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe.");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("driver.get(\"http:// cookbook.seleniumacademy.com/Locators.\r\n");
	
	}

	@Test
	public void testWebTableTest() throws Exception {
		
		WebTables table = new WebTables(driver.findElement(By.cssSelector("div cart-info table")));
		
		Assert.assertEquals(3,table.getRowCount());
		
		Assert.assertEquals(5, table.getcolumnCount());
		
		Assert.assertEquals("iphone",table.getCellData(3, 5) );
		
		WebElement CellEditor = table.getCellEditor(2, 3, 5);
		
		CellEditor.clear();
		CellEditor.sendKeys("5");
		
	}

	@AfterClass
	public void Teardown() {
		
		
		driver.close();
		driver.quit();
	}
}
