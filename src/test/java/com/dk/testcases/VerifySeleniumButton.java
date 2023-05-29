package com.dk.testcases;

import java.util.Hashtable;

import org.openqa.selenium.TakesScreenshot;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dk.basetest.TestBase;

public class VerifySeleniumButton extends TestBase{
	@BeforeClass
	public void isSkip() {
		testCaseName=this.getClass().getSimpleName();//{
		System.out.println("Test case name is : "+testCaseName);
		if(run_mode.get(testCaseName).equalsIgnoreCase("Y"))
			System.out.println("Exceuting test case : "+testCaseName); else throw new
			SkipException("Skipping test case "+testCaseName+" as it's run mode is set to No");
		
	}
	@Test(dataProvider = "data_Collection")
	public void clickonSeleniumButtonTest(Hashtable<String, String> hdata) {
		//test=reports.startTest("VerifyTitleOfByAutomation");
		
		hp.TrainingLinkTest().clickOnSeleniumButtonTest(hdata);
	}
	
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}
}

