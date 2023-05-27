package com.dk.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dk.basetest.TestBase;

public class VerifyTitleOfByAutomation extends TestBase{

	@BeforeClass
	public void isSkip() {
		testCaseName=this.getClass().getSimpleName();//{
//		System.out.println("Test case name is : "+testCaseName);
//		if(htRunMode.get(testCaseName).equalsIgnoreCase("Y"))
//			System.out.println("Exceuting test case : "+testCaseName); else throw new
//			SkipException("Skipping test case "+testCaseName+" as it's run mode is set to No");
//	}	
	}
	@Test
	public void getBymatAutomationTitletest() {
		//test=reports.startTest("VerifyTitleOfByAutomation");
		hp.homePageTitle().about_usLinkTest();
	}
	
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}
}

