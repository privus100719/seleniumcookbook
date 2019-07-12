package com.SeleniumCookBook.example.SeleniumPratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LunchBrowsers

{
	WebDriver driver;

	@Test
	public void LunchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		
	}

}
