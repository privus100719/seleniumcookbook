package com.pom.practice.firstpom.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class GetDataProvider {

	public static DataFormatter formatter= new DataFormatter();
	
	@DataProvider
	public Object[][] ReadTestData() throws IOException {
		
		System.out.println(System.getProperty("user.dir")+ "\\DataReader\\TestData.xlsx");
		FileInputStream fileInputStream= new FileInputStream(System.getProperty("user.dir")+ "\\DataReader\\TestData.xlsx"); 
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
    	XSSFSheet worksheet = workbook.getSheetAt(0);
		XSSFRow Row=worksheet.getRow(0);      
			    
			int RowNum = worksheet.getPhysicalNumberOfRows();// count number of Rows
		    int ColNum= Row.getLastCellNum(); // get last ColNum 
		    
		    Object Data[][]= new Object[RowNum-1][ColNum]; // pass count data in array
	        
	        for(int i=0; i<RowNum-1; i++) //Loop work for Rows
	        {  
	            XSSFRow row= worksheet.getRow(i+1);
	             
	            for (int j=0; j<ColNum; j++) //Loop work for colNum
	            {
	                if(row==null)
	                    Data[i][j]= "";
	                else
	                {
	                    XSSFCell cell= row.getCell(j);
	                    if(cell==null)
	                    	
	                        Data[i][j]= ""; //if it get Null value it pass no data 
	                    else
	                    {
	                        String value=formatter.formatCellValue(cell);
	                        Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
	                    }
	                }
	            }
	        }
	return Data;

	}
}
