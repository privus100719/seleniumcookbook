package com.pom.practice.firstpom.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pom.practice.firstpom.*;
import com.qa.ExtentReportListener.*;

public class LoginTest extends BaseTest
{

	@Test(priority = 0)
	public void TC_01init() throws IOException {
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		try {
				loginpage.Username("Admin");
				loginpage.setPassword("admin123");	
				loginpage.click();
				

				String gtText = driver.findElement(By.xpath("//*[@id=\'menu_dashboard_index\']")).getText();
			
				if(gtText.equalsIgnoreCase("Dashboard")) {
					ExtentTestManager.startTest("Login Test");
					ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
					ExtentTestManager.endTest();
				}
			
		}catch(Exception e) {
			ExtentTestManager.startTest("Login Test");
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			ExtentTestManager.getTest().log(Status.FAIL, "Wrong credentials ented");
			ExtentTestManager.endTest();
			loginpage.TakeScreenshots("Test", ".png");
		}
	}
	
	
	@Test(priority = 1)
	public void TC_02into() throws IOException {
		
		AdminPage adminPage=PageFactory.initElements(driver, AdminPage.class);
		
		try {
			adminPage.Admin();
			adminPage.Username("Test");
			adminPage.Dropdown("usrRole", 1);
			adminPage.empName("Test1");
			adminPage.Dropdown("status", 1);
			adminPage.Search();
			
			
			String gtText = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td")).getText();
			
			if(gtText.equalsIgnoreCase("Records Found"))/* || !gtText.isEmpty())*/ {
				ExtentTestManager.startTest("Admin Test");
				ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
				ExtentTestManager.endTest();
			}
			
		}catch(Exception e){
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			adminPage.TakeScreenshots("No search person", ".png");
			ExtentTestManager.startTest("Admin Test");
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			ExtentTestManager.getTest().log(Status.FAIL, "Wrong credentials ented");
			ExtentTestManager.endTest();
			adminPage.TakeScreenshots("Test", ".png");
			}
	}
	
	
	@Test(priority = 2)
	public void TC_03in() throws IOException {
		PIMPage pimPage = PageFactory.initElements(driver, PIMPage.class);
		
		
		try {
			pimPage.pim();
			pimPage.employeeName("Ashri");
			pimPage.Id("1245");
			pimPage.Dropdown("emps",2);
			pimPage.SupervisorName("dudd");
			pimPage.Dropdown("inc",1);
			pimPage.Dropdown("jobtitle",0);
			pimPage.Dropdown("sub",3);
			pimPage.Search();
			
			String gtText = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText();
			
				if(gtText.equalsIgnoreCase("Record Found") || !gtText.isEmpty()) {
				ExtentTestManager.startTest("PIM Test");
				ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
				ExtentTestManager.endTest();
				}
			
		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			pimPage.TakeScreenshots("No search person", ".png");
			ExtentTestManager.startTest("PIM Test");
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			ExtentTestManager.getTest().log(Status.FAIL, "Wrong credentials ented");
			ExtentTestManager.endTest();
			pimPage.TakeScreenshots("Test", ".png");
		}
		
		
		
	}
}
		
		
	
	
	

	


