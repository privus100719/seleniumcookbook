package com.pom.practice.firstpom;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;


public class BasePage

{
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void waitvisibility(By elementsBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementsBy));
	}
 
	public void click(By loginUser) {
		//waitvisibility(elementBy);
		
		driver.findElement(loginUser).click(); //By.xpath("")
		//System.out.println("Login Test");
	
	}
	public void writeText(By elementBy,String text) { 	
		//waitvisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}
	
	public String readText(By elementBy) {
		//waitvisibility(elementBy);
		String gtText = driver.findElement(elementBy).getText();
		return gtText;
	}
	
	public void TextField(By elementBy, String text) {
		//waitvisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}
	
	public void SelDropdown(WebElement genDropdown, int i) {
	
		Select sel = new Select((WebElement) genDropdown);
		sel.selectByIndex(i);
	}
	
	
	//ScreenShots
	
	public void TakeScreenshots(String fileName, String fileExtension) throws IOException {
		

		String ScreenshotDirName = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		
		File crtDateFolder = new File(System.getProperty("user.dir") + "\\Screenshots\\" + ScreenshotDirName);
		
		if(!crtDateFolder.exists()) {
			crtDateFolder.mkdir();
		}
		
		//@SuppressWarnings("unchecked")
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = ((TakesScreenshot) srcShot).getScreenshotAs(OutputType.FILE);
		File DestFile = new File(crtDateFolder+ "\\" + fileName + fileExtension); //    /Screenshots
        FileUtils.copyFile(SrcFile, DestFile);
	}
}
