package WorkingWithSeleniumApi;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickTest {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
	}
	
	@Test
	public void testDoubleClick() throws Exception {
	
	WebElement message = driver.findElement(By.id("message"));

	assertEquals("rgba(0, 0, 255, 1)",
	message.getCssValue("background-color"));
	Actions builder = new Actions(driver);
	builder.doubleClick(message).perform();

	assertEquals("rgba(255, 255, 0, 1)",message.getCssValue("background-color"));
	  
	}
	
	@Test
	public void testDragDrop() {
	driver.navigate().to("http://cookbook.seleniumacademy.com/DragDropDemo.html");
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	Actions builder = new Actions(driver);
	builder.dragAndDrop(source, target) .perform();
	assertEquals("Dropped!", target.getText());
	}
	
	
	@Test
	public void testContextMenu() {
	WebElement clickMeElement =
	driver.findElement(By.cssSelector("div.context-menuone.box.menu-1"));
	WebElement editMenuItem =
	driver.findElement(By.cssSelector("li.context-menuitem.icon-edit"));
	Actions builder = new Actions(driver);
	builder.contextClick(clickMeElement)
	.moveToElement(editMenuItem)
	.click()
	.perform();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	assertEquals("clicked: edit", alert.getText());
	alert.dismiss();
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
}
