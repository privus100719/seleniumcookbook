package com.pom.practice.firstpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		// create date folder under screenshots
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	@AfterClass
	
	public void teardown() 
	{
		driver.close();
	}
}

	
	
	

