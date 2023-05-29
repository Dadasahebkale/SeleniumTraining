package com.dk.basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bymatautomation.seleniumtraining.ExcelReader;
import com.dk.commonmethods.MyExcelReader;

public class ExcelUtils {
public static MyExcelReader myExcelReader;
	@Test
	public void excelUtilTest() {
		myExcelReader=new MyExcelReader("D:\\TestingFramework\\FrameWork\\src\\test\\resources\\testData\\Master_Sheet.xlsx");
		//myexlreader.getCellData("Test_Data", 2, 1);
		//myexlreader.addSheet("NewSheet");
		//myexlreader.addColumn("NewSheet", "Name");
//	String text=	myexlreader.getCellData("Test_Cases", "TestCaseName", 5);
//	myexlreader,"Test_Data","VerifyInquiryRegisterTest1")
////	System.out.println(myexlreader.getCellData("TestCases", text, 0));
//		ExcelReader ex=new ExcelReader("");
//		my
	
  }
}
