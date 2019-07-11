package FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindingElement {


	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void settingupwithCromedriver()
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]")).click();
		driver.findElement(By.linkText("Admin")).click();
      	driver.findElement(By.cssSelector("#menu_leave_viewLeaveModule b")).click();
		
      	driver.findElements(By.linkText("Admin"));
		
	}
	
	@AfterTest
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
