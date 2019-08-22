package ExtendingSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Objectmaps {
	
	Properties properties;

		public void ObjectMap(String mapFile)
		{
		properties = new Properties();
		try {
		FileInputStream in = new FileInputStream(mapFile);
		properties.load(in);
		in.close();
		}catch (IOException e) {
		System.out.println(e.getMessage());
		}
		}
		
		
		public By getLocator(String logicalElementsName)throws Exception {
			
			String locator = properties.getProperty(logicalElementsName);
			
			String locatorType = locator.split(">")[0];
			
			String locatorvalue = locator.split(">")[1];
			
			if(locatorType.toLowerCase().equals("id"))
				
			return By.id(locatorvalue);
			
			else if(locatorType.toLowerCase().equals("name"))
				
			return By.name(locatorvalue);
			
			else if(locatorType.toLowerCase().equals("classname"))
			
			return By.className(locatorvalue);
			
			else if((locatorType.toLowerCase().equals("tagname")))
					
			return By.tagName(locatorvalue);
			
			else if((locatorType.toLowerCase().equals("linktext")))
								
			return By.linkText(locatorvalue);
			
			else if(locatorType.toLowerCase().equals("partiallinktext"))
						
			return By.partialLinkText(locatorvalue);
			
			else if((locatorType.toLowerCase().equals("cssselector")))
							
			return By.cssSelector(locatorvalue);
			
			else if(locatorType.toLowerCase().equals("xpath"))
						
			return By.xpath(locatorvalue);
			
			else
						
			throw new Exception("Locator type" + locatorType + "not defined!!");	}
		
		
		
}



		

		
		
