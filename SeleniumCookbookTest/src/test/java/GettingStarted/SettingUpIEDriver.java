package GettingStarted;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SettingUpIEDriver {

WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest()
	{
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	@Test
	public void settingupwithiedriver()
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@AfterTest
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
