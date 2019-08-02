package WorkingWithSeleniumApi;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class browsernavigations {
	
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.google.com");
		
	}
	
	
	@Test
	public void testNavigation() {
	
	WebElement searchField = driver.findElement(By.name("q"));
	searchField.clear();
	driver.findElement(By.name("q")).sendKeys("selenium webdriver");
	searchField.sendKeys("selenium webdriver");
	searchField.submit();
	
	WebElement resultLink = driver.findElement(By.linkText("Selenium WebDriver"));
	resultLink.click();
	new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Selenium WebDriver"));
	assertEquals("Selenium WebDriver", driver.getTitle());
	driver.navigate().back();
	new WebDriverWait(driver, 10).until(ExpectedConditions
	.titleIs("selenium webdriver - Google Search"));
	assertEquals("selenium webdriver - Google Search", driver.
	getTitle());
	driver.navigate().forward();
	new WebDriverWait(driver, 10).until(ExpectedConditions
	.titleIs("Selenium WebDriver"));
	assertEquals("Selenium WebDriver", driver.getTitle());
	driver.navigate().refresh();
	new WebDriverWait(driver, 10).until(ExpectedConditions
	.titleIs("Selenium WebDriver"));
	assertEquals("Selenium WebDriver", driver.getTitle());
	driver.close();
	
	}
	

}
