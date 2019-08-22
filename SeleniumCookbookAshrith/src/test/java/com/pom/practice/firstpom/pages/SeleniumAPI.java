package com.pom.practice.firstpom.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumAPI 
{
	WebDriver driver;
	
	private boolean iSElementPresent(By by) {
		
		try {
			driver.findElement(by);
			
			return true;
			
		}catch(NoSuchElementException e) {
			
		}
		return false;
	}
	
	@Test
	
	public void testisElementpresent() {
		if(iSElementPresent(By.name("airbags"))) {
			
			WebElement airbag = driver.findElement(By.name("airbags"));
			if (!airbag.isSelected())
			{
				airbag.click();
			}
		}else {
			fail("airbag not present");
		}
		
	}
	@Test
	
	public void testElemetEnable() {
		
		WebElement ledheadlamp = driver.findElement(By.name("ledheadlamp"));
		if(ledheadlamp.isEnabled()) {
			
		if(!ledheadlamp.isEnabled()) {
			ledheadlamp.click();
		}
				
				
			}else {
				fail("led lamp is not working");
			}
		}
	
	@Test
	public void testRowselectionusingControlKeys() {
		
		List<WebElement> tablerows = (List<WebElement>) driver.findElement(By.xpath("//table[@class='icedatTbl']/tbody/tr"));
		
		Actions builder = new Actions(driver);
		builder.click(tablerows.get(1));
		builder.keyDown(Keys.CONTROL);
		builder.click(tablerows.get(3));
		builder.keyUp(Keys.CONTROL);
		builder.build();
		builder.perform();
		
		
		//verify two rows were selected
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='icepntbl]/tbody/tr"));
		assertEquals(2, rows.size());
	}
}
		
	
		


		
	
	