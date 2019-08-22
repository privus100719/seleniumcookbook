package com.pom.practice.firstpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.pom.practice.firstpom.*;


public class PIMPage extends BasePage
{
	WebDriver driver;
	
	public PIMPage(WebDriver driver)
	{
		super(driver);
	}
	
	//@FindBy(how=How.XPATH,using="//*[@id=\'menu_pim_viewPimModule\']")WebElement PIM;
	
	//@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_employee_name_empName\']")WebElement Employeename;
	
	//@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_id\']")WebElement Id;
	
	/*@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_employee_status\']")WebElement EmploymentStatus;
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_termination\']")WebElement Include;
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_supervisor_name\']")WebElement SupervisorName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_job_title\']")WebElement JobTitle;
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_sub_unit\']")WebElement SubUnit;
	*/
	

	By pimClick= By.id("menu_pim_viewPimModule");
	
	By Employeename = By.id("empsearch_employee_name_empName");
	
	By Id = By.id("empsearch_id");
	
	//By EmploymentStatus = By.id("empsearch_employee_status");
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_employee_status\']")WebElement EmploymentStatus;
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_termination\']")WebElement Include;
	
	//By Include = By.id("empsearch_termination");
	
	By SupervisorName = By.id("empsearch_supervisor_name");
	

	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_job_title\']")WebElement JobTitle;
	
	@FindBy(how=How.XPATH,using="//*[@id=\'empsearch_sub_unit\']")WebElement SubUnit;
	
	By SearchUser=By.id("searchBtn");
	
	//By JobTitle = By.id("empsearch_job_title");
	
	//By SubUnit = By.id("empsearch_sub_unit");
	
	
	
	public void pim()
	{
		click(pimClick);
		
	}

	public void employeeName(String emp) {
		writeText(Employeename, emp);
		
	}
	
	public void Id(String id) {
		writeText(Id,id);
	}
	
	public void SupervisorName(String Svn) {
		writeText(SupervisorName,Svn);
	}
	
	public void Dropdown(String str, int i) {
		if(str.contains("emps")) {
			EmploymentStatus.click();
			SelDropdown(EmploymentStatus, i);
		}
		if(str.contains("inc")) {
			Include.click();
			SelDropdown(Include, i);
	}
	    if(str.contains("jobtitle")) {
	    	JobTitle.click();
	    	SelDropdown(JobTitle,i);
	    }
	    if(str.contains("sub")) {
	    	SubUnit.click();
	    	SelDropdown(SubUnit,i);
	    }
	}
	    
		 public void Search() {
			click(SearchUser);
		 }
}
	
