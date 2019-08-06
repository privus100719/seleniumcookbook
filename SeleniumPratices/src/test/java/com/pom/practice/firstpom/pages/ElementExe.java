package com.pom.practice.firstpom.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

  


public class ElementExe 
{
	 public WebDriver driver;
	
	@Test
	public void textElementText()
	{
		WebElement message = driver.findElement(By.id("message"));
		String messageText = message.getText();
		assertEquals("click on me and changes the color", messageText);
		
		WebElement area = driver.findElement(By.id("Area"));
		assertEquals("Div's Text\nspan's Text,", area.getText());
		
	}
	
	
	
	
	//the following code
	@Test
	public void testElementAttribute() {
		
		WebElement message = driver.findElement(By.id("message"));
		assertEquals("justify", message.getAttribute("align"));
		
	}
	
	@Test
	
	public void testElementCss() {
		
		
		WebElement message = driver.findElement(By.id("message"));
	}

}
