package com.SeleniumCookBook.example.SeleniumPratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextElement 
{
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void UsersLogin() throws InterruptedException
	
		{
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\'txtUsername\']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
			
			Thread.sleep(3000);

			
	}
	
	@Test(priority = 2)
	public void MenuItems(){
		
		
		driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//driver.findElement(By.xpath("//a[text()='User Management']")).click();
		 
		WebElement eUserManag = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='User Management']")));
		eUserManag.click();
		driver.findElement(By.xpath("//a[text()='Users']")).click();
		
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']")).click();;
			
		
	}
	
	@Test
	public void CssSelectors() {
		
		
	}

}
