package com.dk.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bymatautomation.seleniumtraining.DataCollection;
import com.dk.basetest.TestBase;

public class VerifyInquiryRegisterTest extends TestBase{
	
	@BeforeClass
	public void isSkip() {
		testCaseName=this.getClass().getSimpleName();//{
		System.out.println("Test case name is : "+testCaseName);
		if(run_mode.get(testCaseName).equalsIgnoreCase("Y"))
			System.out.println("Exceuting test case : "+testCaseName); else throw new
			SkipException("Skipping test case "+testCaseName+" as it's run mode is set to No");
		
	}
	

	@Test(dataProvider = "data_Collection")
	public void getInquiryRegisterdetails(Hashtable<String, String> hdata) {
		//test=reports.startTest("VerifyInquiryRegisterTest");
		hp.InquiryRegisterTest().getDetailFromExcel(hdata);
	}
	
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}
//	@DataProvider
//    public Object[][] data_Collection(){
//        DataCollection dc=new DataCollection(excel,"Test_Data","VerifyInquiryRegisterTest");
//                return dc.dataArray();
//    }
}

