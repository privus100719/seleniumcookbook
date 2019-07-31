package WorkingWithElements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecution {

	@Test
	public void testJavaScriptCalls() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	try {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String title = (String) js.executeScript("returndocument.title");
	assertEquals("Google", title);
	long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
	assertEquals(42, links);
	}
	
	finally {
	driver.quit();
	}
	}
}
