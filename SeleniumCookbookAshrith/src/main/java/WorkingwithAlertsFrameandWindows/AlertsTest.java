package WorkingwithAlertsFrameandWindows;


import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void Setup() throws AWTException {
		
		
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
	    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Windows\\Temp\\logs.txt");
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		
		
		
		//this is for chrome
		//driver.get("https://bsf:cloud9@cicd.mybsf.org");
		
		
		
		//This is for Firefox
		
		/*driver.switchTo().alert().sendKeys("bsf" + Keys.TAB + "cloud9");
		
		driver.switchTo().alert().accept();*/
		
		
		
	}
	
	 
		
		@Test(priority=1)
		public void testSimpleAlert() throws InterruptedException {
		
		driver.findElement(By.id("simple")).click();
		
		Alert WebDriverWait = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		String textOnAlert = alert.getText();
		
		Thread.sleep(1000);
		
		assertEquals("Hello! I am an alert box!", textOnAlert);
		
	    System.out.println(textOnAlert);	
	    
		alert.accept();
		}
		
		@Test(priority=2)
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
		

		@Test(priority=3)
		public void testConfirmDismiss() {
		
		driver.findElement(By.id("confirm")).click();

		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();

		WebElement message = driver.findElement(By.id("demo"));
		
		assertEquals("You Dismissed Alert!", message.getText());
		}
		
		@Test(priority=4)
		public void testPrompt() {
			
			driver.findElement(By.id("prompt")).click();
			
			Alert alert = driver.switchTo().alert();
		
			alert.sendKeys("Foo");
			
			alert.accept();
			
			WebElement message = driver.findElement(By.id("prompt_demo"));
			
			assertEquals("Hello Foo! How are you today?",message.getText());
			
			}
		
		@AfterClass
		
		public void Tesrdown() {
			
			driver.close();
			
		}
		 	
		
		
		
		
	}


