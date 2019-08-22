package com.pom.practice.firstpom.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FrameTest 
{
	
	WebDriver driver;
	
	public void Setup() {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://cookbook.seleniumacademy.com/Frames.html");
	}
	
	@Test
	
	public void testFramewithIDorname() {
		
		try {
			
			driver.switchTo().frame("right");
			
			WebElement msg = driver.findElement(By.tagName("p"));
			
			assertEquals("This is right frame", msg.getText());
			
		}finally 
		
		{
			
			driver.switchTo().defaultContent();
				
			}
		
		try {
			
			driver.switchTo().frame("left");
			WebElement msg = driver.findElement(By.tagName("p"));
			assertEquals("This is left frame", msg.getText());
		}
		
		finally {
			
			driver.switchTo().defaultContent();
			
		
		}
	}
	
	@AfterClass
	
	public void teardown() {
		
		driver.close();
		driver.quit();
	
	}
	
	//this is the second method to use index to identift the frame
	
	
	@Test
	
	public void testFrameIndex() {
		
		try {
			
			driver.switchTo().frame(1);
			
			WebElement msg = driver.findElement(By.tagName("p"));
			
			assertEquals("this frame doesn't have Id or name", msg.getText());
		}
			
			
			finally
			{
				driver.switchTo().defaultContent();
				
				
				
			}
		}
}
