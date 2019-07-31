package PageObjectModel;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

public class BmiCalculatorTests2 {

	@Test
	public void testBmiCalculation() throws InterruptedException
	{
	
	BmiCalcPage2 bmiCalcPage = new BmiCalcPage2();

	bmiCalcPage.load();

	bmiCalcPage.calculateBmi("181", "80");

	assertEquals("24.4", bmiCalcPage.getBmi());
	assertEquals("Normal", bmiCalcPage.getBmiCategory());
	bmiCalcPage.close();
	bmiCalcPage.tearDown();
	}
	
	
}
