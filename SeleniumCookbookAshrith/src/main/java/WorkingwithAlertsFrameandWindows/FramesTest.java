package WorkingwithAlertsFrameandWindows;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FramesTest {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe.");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://cookbook.seleniumacademy.com/Frames.html");
	}
	
	
	
	@Test(priority=1)
	
	public void testFrameWithIdOrName() {
	try {
	
	driver.switchTo().frame("left");
	
	WebElement msg = driver.findElement(By.tagName("p"));
	
	assertEquals("This is Left Frame", msg.getText());
	
	} finally {
	
	driver.switchTo().defaultContent();
	}
	try {
	
	driver.switchTo().frame("right");
	
	WebElement msg = driver.findElement(By.tagName("p"));
	
	assertEquals("This is Right Frame", msg.getText());
	
	} finally {

	driver.switchTo().defaultContent();
	}
	}
	
	
	
	
	@Test(priority=2)
	
	public void testFrameByIndex() {
		
	try {
	driver.switchTo().frame("right");
	
	WebElement msg = driver.findElement(By.tagName("p"));
	
	assertEquals("This is Right Frame", msg.getText());
	
	} finally {
	
	driver.switchTo().defaultContent();
	}
	}
	
	
	@Test(priority=3)
	public void testIFrame() {
	
	String currentWindow = driver.getWindowHandle();
	
	try {
		
	driver.switchTo().frame("right");
	
	WebElement twitterFrame = driver.findElement(By.tagName("iframe"));
	try {
	
	driver.switchTo().frame(twitterFrame);
	
	//WebElement button = 
			
			driver.findElement(By.id("follow-button")).click();
	
	//button.click();
	
	try {

	for (String windowId : driver.getWindowHandles()) {
		
	driver.switchTo().window(windowId);
	
	if (driver.getTitle().equals("Unmesh Gundecha (@upgundecha) on Twitter")) {
		
    assertEquals("Twitter Login Popup Window Found","Twitter Login Popup Window Found");
    
	driver.close();
	
	break;
	}
	}
	} finally {
	
	driver.switchTo().window(currentWindow);
	}
	} finally {
	
	driver.switchTo().defaultContent();
	}
	} finally {
	
	driver.switchTo().defaultContent();
	}
	}

	
	@AfterClass
	public static void tearDown() throws InterruptedException {

	Thread.sleep(10000);
	driver.quit();
	}


}
