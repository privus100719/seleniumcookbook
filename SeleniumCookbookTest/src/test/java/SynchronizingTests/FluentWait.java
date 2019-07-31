/*package SynchronizingTests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWait {
	
	

	 public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Test
	 public static void fluentWaitMethod(){
	 System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
	 driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
	 
	 
	 FluentWait wait = (FluentWait) ((Object) new FluentWait(driver)
	        .withTimeout(30, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);
	 
	 WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	 public WebElement apply(WebDriver driver) {
	 WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
	 String getTextOnPage = element.getText();
	 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
	 System.out.println(getTextOnPage);
	 return element;
	 }else{
	 System.out.println("FluentWait Failed");
	 return null;
	 }
	 }
	 });
	 }

	private WebElement until(Function<WebDriver, WebElement> function) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		return null;
	}
}
*/