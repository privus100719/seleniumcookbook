package HTML5;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTML5VideoPlayer {

	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
/*	System.setProperty("webdriver.chrome.driver",
	"src/test/resources/drivers/chromedriver.exe");*/
	driver = new ChromeDriver();
	driver.get("http://cookbook.seleniumacademy.com/html5video.html");
	
	}
	
	@Test
	public void testHTML5VideoPlayer() throws Exception {

	WebElement videoPlayer = driver.findElement(By.id("vplayer"));
	

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	String source = (String) jsExecutor.executeScript(
	"return arguments[0].currentSrc;", videoPlayer);

	long duration = (Long) jsExecutor.executeScript(
	"return arguments[0].duration", videoPlayer);

	assertEquals("http://html5demos.com/assets/dizzy.mp4",
	source);
	assertEquals(25, duration);

	jsExecutor.executeScript("return arguments[0].play()",
	videoPlayer);
	Thread.sleep(5000);
	
	jsExecutor.executeScript("arguments[0].pause()", videoPlayer);

	File scrFile = ((TakesScreenshot)
	driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new
	File("C:\\Users\\rajve\\workspace\\Oxygen Workspace\\SeleniumCookbookTest\\Screenshot\\pause_play.png"));
	}
	
	@AfterTest
	public void tearDown() {
	driver.quit();
	}
	
}
