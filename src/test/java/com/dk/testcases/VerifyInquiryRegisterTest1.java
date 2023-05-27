package com.dk.testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bymatautomation.seleniumtraining.DataCollection;
import com.dk.basetest.TestBase;

public class VerifyInquiryRegisterTest1 extends TestBase{

	@BeforeClass
	public void isSkip() {
		testCaseName=this.getClass().getSimpleName();//{
//		System.out.println("Test case name is : "+testCaseName);
//		if(htRunMode.get(testCaseName).equalsIgnoreCase("Y"))
//			System.out.println("Exceuting test case : "+testCaseName); else throw new
//			SkipException("Skipping test case "+testCaseName+" as it's run mode is set to No");
//	}	
	}
	@Test(dataProvider = "data_Collection")
	public void getTitletest(Hashtable<String, String> hdata) {
		//test=reports.startTest("VerifyInquiryRegisterTest1");
		hp.InquiryRegisterTest1().getDetailFromExcel1(hdata);
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
//	@DataProvider
//    public Object[][] data_Collection(){
//        DataCollection dc=new DataCollection(excel,"Test_Data","VerifyInquiryRegisterTest1");
//                return dc.dataArray();
//    }
}

