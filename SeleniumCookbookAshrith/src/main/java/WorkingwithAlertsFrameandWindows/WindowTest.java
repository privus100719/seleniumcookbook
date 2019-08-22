package WorkingwithAlertsFrameandWindows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe.");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://cookbook.seleniumacademy.com/html5video.html");
	}
	
	
	
	@Test
	public void testWindowUsingName() {

	String parentWindowId = driver.getWindowHandle();

	driver.findElement(By.id("helpbutton")).click();
	
	try {

	driver.switchTo().window("HelpWindow");
	
	try {

	assertEquals("Help", driver.getTitle());
	
	} finally {

	driver.close();
	}
	} finally {

	driver.switchTo().window(parentWindowId);
	}

	assertEquals("Build my Car - Configuration",driver.getTitle());
	
	}
	
	
	@Test
	public void testWindowUsingTitle() {
	
	String parentWindowId = driver.getWindowHandle();
	
	driver.findElement(By.id("visitbutton")).click();
	
	try {
		
	for (String windowId : driver.getWindowHandles()) {
		
	String title = driver.switchTo().window(windowId).getTitle();
	
	if (title.equals("Visit Us")) {
		
	assertEquals("Visit Us", driver.getTitle());
	
	driver.close();
	
	break;
	}
	}
	} finally {
	
	driver.switchTo().window(parentWindowId);
	}
	
	assertEquals("Build my Car - Configuration", driver.getTitle());
	}
	
	@Test
	
	public void testWindowUsingContents() {
	
	String currentWindowId = driver.getWindowHandle();
	
	driver.findElement(By.id("chatbutton")).click();
	
	try {
		
	for (String windowId : driver.getWindowHandles()) {
		
	String windowId1 = null;
	
	driver.switchTo().window(windowId1);
	
	String pageSource = driver.getPageSource();
	
	if (pageSource.contains("Configuration - Online Chat")) {
	
	assertTrue(driver.findElement(By.tagName("p")).getText().equals("Wait while we connect you to Chat..."));
	
	driver.findElement(By.id("closebutton")).click();
	
	break;
	}
	}
	} finally {
	
	driver.switchTo().window(currentWindowId);
	}
	
	assertEquals("Build my Car - Configuration", driver.getTitle());
	}
	
	
	@AfterClass
	public static void tearDown() {
		
	driver.quit();
	}

}
