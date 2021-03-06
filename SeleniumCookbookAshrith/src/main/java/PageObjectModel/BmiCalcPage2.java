package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BmiCalcPage2 {
	
	
	private WebElement heightCMS;
	private WebElement weightKg;
	private WebElement Calculate;
	private WebElement bmi;
	private WebElement bmi_category;
	private WebDriver driver;
	private String url = "http://cookbook.seleniumacademy.com/bmicalculator.html";
	
	
	public BmiCalcPage2() {
	System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	PageFactory.initElements(driver, this);
	}

	public void load() {
		
	this.driver.get(url);
	}
	
	public void close() {
		
	this.driver.close();
	}

	public void calculateBmi(String height, String weight) {
		
	heightCMS.sendKeys(height);
	
	weightKg.sendKeys(weight);
	
	Calculate.click();
	}
	

	public String getBmi() {
		
	return bmi.getAttribute("value");
	}
	
	public String getBmiCategory() {
		
	return bmi_category.getAttribute("value");
	}
	
	
	public void tearDown() throws InterruptedException {
		
	Thread.sleep(10000);
	driver.quit();
	}

}
