package com.pom.practice.firstpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.pom.practice.firstpom.*;

public class AdminPage extends BasePage
{
	
	WebDriver driver;
	
	public AdminPage(WebDriver driver)
	{
		super(driver);
	}

	//@FindBy(how=How.XPATH,using="//*[@id=\'menu_admin_viewAdminModule\']")WebElement Admin;
	/*@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_userName\']")WebElement Users;

	@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_userName\']")WebElement Username;
	@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_userType\']")WebElement Dropdown;
	@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_employeeName_empName\']")WebElement Empname;
	@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_status\']")WebElement Dropdown1;*/
	
	
		By Username = By.id("searchSystemUser_userName");
		
		By Empname = By.id("searchSystemUser_employeeName_empName");

		By clickAdmin=By.id("menu_admin_viewAdminModule");
		
		@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_userType\']")WebElement AdminDropdown;
		
		@FindBy(how=How.XPATH,using="//*[@id=\'searchSystemUser_status\']")WebElement StatusDropdown;
		
		//@FindBy(how=How.XPATH,using="//*[@id=\'searchBtn\']")WebElement SearchUser;
		By SearchUser=By.id("searchBtn");
		
		public  void Admin()
		{
			click(clickAdmin);
		}
		public void Username(String Users) {
			writeText(Username, Users);
		}
		
		public void empName(String Emp) {
			writeText(Empname, Emp);
		}
		
		public void Dropdown(String str, int i) {
			if(str.contains("usrRole")) {
				AdminDropdown.click();
				SelDropdown(AdminDropdown, i);
			}
			if(str.contains("status")) {
				StatusDropdown.click();
				SelDropdown(StatusDropdown, i);
			}
		}
			
		public void Search() {
			click(SearchUser);
		}
		
		public PIMPage UserSelect() {
			
			return new PIMPage(driver);

         }
}

	
	

