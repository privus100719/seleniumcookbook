package WorkingWithSeleniumApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class WorkingWithContextMenu {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/DragDropDemo.html");
		driver.manage().window().maximize();
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
}

