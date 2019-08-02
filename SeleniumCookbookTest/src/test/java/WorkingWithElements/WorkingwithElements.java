package WorkingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithElements extends BaseDriver{

	@Test
	public void AutomatingTextBoxTestAreas()
	{
		
	 WebElement ele1 =  driver.findElement(By.id("menu_pim_viewPimModule"));
	 System.out.println("text of ele1 : " +ele1.getText());
	 System.out.println("Attribute of ele1 : " +ele1.getAttribute("id"));
	 Assert.assertEquals("menu_pim_viewPimModule", ele1.getAttribute("id"));
	 ele1.click();
	 
    
	 WebElement ele2 =  driver.findElement(By.id("menu_pim_addEmployee"));
	 System.out.println("text of ele2 : " +ele2.getText());
	 System.out.println("Attribute of ele2 : " +ele2.getAttribute("id"));
	 Assert.assertEquals("menu_pim_addEmployee", ele2.getAttribute("id"));
	 ele2.click();
	 
	 
	 
     WebElement fullname =  driver.findElement(By.id("firstName"));
	 System.out.println("text of fullname : " +fullname.getText());
	 System.out.println("Attribute of fullname : " +fullname.getAttribute("id"));
	 Assert.assertEquals("firstName", fullname.getAttribute("id"));
	 fullname.sendKeys("raj");
	 
	 
	 
     WebElement midlename =  driver.findElement(By.id("middleName"));
	 System.out.println("text of midlename : " +midlename.getText());
	 System.out.println("Attribute of midlename : " +midlename.getAttribute("id"));
	 Assert.assertEquals("middleName", midlename.getAttribute("id"));
	 midlename.sendKeys("veer");
	 
	 
     WebElement lastname =  driver.findElement(By.id("lastName"));
	 System.out.println("text of lastname : " +lastname.getText());
	 System.out.println("Attribute of lastname : " +lastname.getAttribute("id"));
	 Assert.assertEquals("lastName", lastname.getAttribute("id"));
	 lastname.sendKeys("singh");
	 
	 WebElement Savebutton =  driver.findElement(By.id("btnSave"));
	 System.out.println("text of Savebutton : " +Savebutton.getText());
	 System.out.println("Attribute of Savebutton : " +Savebutton.getAttribute("id"));
	 Assert.assertEquals("btnSave", Savebutton.getAttribute("id"));
	 Savebutton.click();
	 
	 
	 WebElement editbutton =  driver.findElement(By.xpath("//input[@id='btnSave']"));
	 editbutton.click();
	 
	 WebElement licencNum =  driver.findElement(By.name("personal[txtLicenNo]"));
	 licencNum.sendKeys("12345");
	 
	 
	 WebElement expirydate =  driver.findElement(By.xpath("//form[@id='frmEmpPersonalDetails']/fieldset/ol[2]//img[@alt='']"));
	 expirydate.click();
	 
	 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();
	 
	 
	 WebElement meritsttaus =  driver.findElement(By.id("personal_cmbMarital"));
	 meritsttaus.click();
	 
	 WebElement marit =  driver.findElement(By.xpath("//option[@value='Married']"));
	 marit.click();
	 
	 driver.findElement(By.xpath("//select[@id='personal_cmbNation']/option[@value='4']")).click();
	 driver.close();
	 
	 
	 
	
/*	 
	 WebElement Employ_List =  driver.findElement(By.id("menu_pim_viewEmployeeList"));
	 System.out.println("text of Employ_List : " +Employ_List.getText());
	 Employ_List.click();
	 
	 WebElement searchList =  driver.findElement(By.id("empsearch[employee_name][empName]"));
	 System.out.println("text of searchList : " +searchList.getText());
	 searchList.sendKeys("raj veer singh");
	 
	 
	 WebElement searchbutton =  driver.findElement(By.id("empsearch[employee_name][empName]"));
	 System.out.println("text of searchList : " +searchbutton.getText());
	 searchbutton.click();*/
	 
	 
	 
	}
}
