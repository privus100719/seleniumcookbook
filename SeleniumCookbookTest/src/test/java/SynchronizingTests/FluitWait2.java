/*package SynchronizingTests;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;


public class FluitWait2 {

	@Test
	public void testFluentWaitWithPredicate() {
	final WebDriver driver = new ChromeDriver();
	// Launch the sample Ajax application
	driver.get("http://cookbook.seleniumacademy.com/AjaxDemo.html");
	try {
	FluentWait<By> wait = new FluentWait<By>(By.linkText("Page4"))
	.withTimeout(1000, TimeUnit.MILLISECONDS)
	.pollingEvery(200, TimeUnit.MILLISECONDS)
	.ignoring(NoSuchElementException.class);
	wait.until(new Predicate<By>() {
	public boolean apply(By by) {
	try {
	return driver.findElement(by).isDisplayed();
	} catch (NoSuchElementException ex) {
	return false;
	}
	}

	public boolean test(By arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	});
	driver.findElement(By.linkText("Page 4")).click();
	} finally {
	driver.quit();
	}
	}
}
*/