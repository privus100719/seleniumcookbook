package com.SeleniumCookBook.example.SeleniumPratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LunchIEBrowser 
{
	WebDriver driver;

	@Test
	public void LunuchIEBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://google.com");
	}
}
