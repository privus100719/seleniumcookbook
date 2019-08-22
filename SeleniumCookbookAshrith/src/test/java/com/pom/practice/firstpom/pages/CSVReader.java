package com.pom.practice.firstpom.pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CSVReader {

	
	@DataProvider(name = "test")
    public Iterator<Object []> provider( ) throws InterruptedException, IOException
    {
        List<Object []> testCases = new ArrayList<Object[]>();
        String[] data= null;

        //this loop is pseudo code
       // @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+ "\\DataReader\\CSVTestFile.csv"));
        String line;
		while ((line = br.readLine()) != null) {
            // use comma as separator
            data= line.split(",");
            testCases.add(data);
        }

        return testCases.iterator();
    }

  

    }
  
/*}
*/