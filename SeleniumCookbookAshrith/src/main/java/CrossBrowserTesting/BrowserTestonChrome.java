	
	package CrossBrowserTesting;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.Test;

	import java.net.URL;

	public class BrowserTestonChrome {

		  public static final String USERNAME = "cloudsolutions2";
			public static final String AUTOMATE_KEY = "gc6ecaDNtfsAsiztx1qz";
	    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	      @Test
		  public void browserstacktest() throws Exception {

		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "74.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1024x768");
		    caps.setCapability("name", "Bstack-[Java] Sample Test");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("http://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));

		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();
	      }
	}