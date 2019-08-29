package com.pom.practice.firstpom.pages;

import java.io.IOException;
import java.security.Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pom.practice.firstpom.*;
import com.qa.ExtentReportListener.*;
import com.pom.practice.firstpom.pages.GetDataProvider;
import com.pom.practice.firstpom.pages.CSVReader;


public class LoginTest extends BaseTest
{	
	
	@Test(priority = 0, dataProvider = "ReadTestData", dataProviderClass = GetDataProvider.class)
	
	// @Test(priority=0 ,description = "Test", groups =  "test" , dataProvider = "test", dataProviderClass = CSVReader.class)Read Data through CSVFile
	
	public void TC_01init(String username, String password,String UserName, String usersearch, String userrole,String empname,String EmpName,String Id,String SupName) throws IOException {
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		try {
			
				loginpage.SetUsername(username);
				loginpage.setPassword(password);	
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
	
	
	@Test(priority = 1,dataProvider = "ReadTestData", dataProviderClass = GetDataProvider.class)
	
	public void TC_02into(String username, String password,String UserName, String usersearch, String userrole,String empname,String EmpName,String Id,String SupName) throws IOException {
		
		AdminPage adminPage=PageFactory.initElements(driver, AdminPage.class);
		
		try {
			adminPage.Admin();
			adminPage.Username(UserName);
			adminPage.Dropdown("usrRole", 1);
			adminPage.empName(empname);
			adminPage.Dropdown("status", 1);
			adminPage.Search();
			
			
			String gtText = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td")).getText();
			
			if(gtText.equalsIgnoreCase("No Record Found") || !gtText.isEmpty()){
				ExtentTestManager.startTest("Admin Test");
				ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
				ExtentTestManager.endTest();
			}
			
		}catch(Exception e){
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			adminPage.TakeScreenshots("ADMIN", ".png");
			ExtentTestManager.startTest("Admin Test");
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			ExtentTestManager.getTest().log(Status.FAIL, "Wrong credentials ented");
			ExtentTestManager.endTest();
			adminPage.TakeScreenshots("Test1", ".png");
			}
	}
	
	
	@Test(priority = 2,dataProvider = "ReadTestData", dataProviderClass = GetDataProvider.class)
	public void TC_03in(String username, String password,String UserName, String usersearch, String userrole,String empname,String EmpName,String Id,String SupName) throws IOException {
		
		PIMPage pimPage = PageFactory.initElements(driver, PIMPage.class);
		
		
		try {
			pimPage.pim();
			pimPage.employeeName(EmpName);
			pimPage.Id(Id);
			pimPage.Dropdown("emps",2);
			pimPage.SupervisorName(SupName);
			pimPage.Dropdown("inc",1);
			pimPage.Dropdown("jobtitle",0);
			pimPage.Dropdown("sub",3);
			pimPage.Search();
			
			String gtText = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText();
			
				if(gtText.equalsIgnoreCase("Records Found") || !gtText.isEmpty()) {
				ExtentTestManager.startTest("PIM Test");
				ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
				ExtentTestManager.endTest();
				}
			
		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			pimPage.TakeScreenshots("PIM", ".png");
			ExtentTestManager.startTest("PIM Test");
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			ExtentTestManager.getTest().log(Status.FAIL, "Wrong credentials ented");
			ExtentTestManager.endTest();
			pimPage.TakeScreenshots("Test2", ".png");
		}
	  }
}
		
		
		
	
	
	

	


