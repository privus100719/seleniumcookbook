package com.pom.practice.firstpom.pages;

import org.openqa.selenium.WebDriver;
import com.pom.practice.firstpom.*;

public class HomePage extends BasePage
{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
/*    
	public HomePage GoToHomePage() {
		driver.get("https://www.n11.com");
		return this;
	}*/
	
	public LoginPage Singin() {
		
		return new LoginPage(driver);
	}
	
}
