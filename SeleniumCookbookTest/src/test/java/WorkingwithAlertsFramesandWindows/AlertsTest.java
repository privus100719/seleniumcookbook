package WorkingwithAlertsFramesandWindows;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsTest {
	
	private static WebDriver driver;
	@BeforeClass
	public static void setUp() {
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
	driver = new FirefoxDriver();
	driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
	driver.manage().window().maximize();
	}
	@Test
	public void testSimpleAlert() throws InterruptedException {
	
	driver.findElement(By.id("simple")).click();
	
	Alert WebDriverWait = new WebDriverWait(driver, 10)
	.until(ExpectedConditions.alertIsPresent());

	Alert alert = driver.switchTo().alert();
	Thread.sleep(1000);
	String textOnAlert = alert.getText();
	Thread.sleep(1000);
	assertEquals("Hello! I am an alert box!", textOnAlert);
    System.out.println(textOnAlert);	
	alert.accept();
	}
	
	@Test
	public void testConfirmAccept() {
		// Click Confirm button to show Confirmation Alert box
		driver.findElement(By.id("confirm")).click();
		// Get the Alert
		Alert alert = driver.switchTo().alert();
		// Click OK button, by calling accept method
		alert.accept();
		// Check Page displays correct message
		WebElement message = driver.findElement(By.id("demo"));
		assertEquals("You Accepted Alert!", message.getText());
		}
	
	
	@Test
	public void testConfirmDismiss() {
	
	driver.findElement(By.id("confirm")).click();

	Alert alert = driver.switchTo().alert();
	
	alert.dismiss();

	WebElement message = driver.findElement(By.id("demo"));
	assertEquals("You Dismissed Alert!", message.getText());
	}
	
	@Test
	public void testPrompt() {
		
		driver.findElement(By.id("prompt")).click();
		
		Alert alert = driver.switchTo().alert();
	
		alert.sendKeys("Foo");
		
		alert.accept();
		
		WebElement message = driver.findElement(By.id("prompt_demo"));
		assertEquals("Hello Foo! How are you today?",
		message.getText());
		}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
	Thread.sleep(10000);
	driver.quit();
	}

}
