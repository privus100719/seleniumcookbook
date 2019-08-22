package com.pom.practice.firstpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pom.practice.firstpom.*;

public class LoginPage extends BasePage

{
	WebDriver driver;


	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//@FindBy(how=How.XPATH,using="//*[@id=\'txtUsername\']")WebElement UsernameTextBox;
	//@FindBy(how=How.XPATH,using="//*[@id=\'txtPassword\']")WebElement passwordTextBox;
	//@FindBy(how=How.XPATH, using="//*[@id=\'btnLogin\']") WebElement signinButton;
	
	
	
	/*By usernameBy = By.id("email");
	By passwordBy = By.id("pass");
	By loginBy = By.id("u_0_a");*/
	
	
	
	By Username = By.id("txtUsername");
	By password = By.id("txtPassword");
	//@FindBy(how=How.XPATH, using="//*[@id=\'btnLogin\']") WebElement clickLogin;
	By clickLogin = By.id("btnLogin");
	
	
	
		public void SetUsername(String User){
			writeText(Username, User);
		}
		// This method is to set Password in the password text box
		public void setPassword(String strPassword){
			writeText(password, strPassword);
		}

		public void click() {
			click(clickLogin);
		
		}
		
		
		public AdminPage UserSelect() {
			
			return new AdminPage(driver);
		}
			
	}

	
		

	
