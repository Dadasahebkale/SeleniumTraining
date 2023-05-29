package com.dk.testcases;

import org.testng.annotations.Test;

import com.bymatautomation.seleniumtraining.ExcelReader;
import com.dk.Xls_Reader;
import com.dk.commonmethods.MyExcelReader;

public class ExcelTest {
	@Test
	public void excel() {
//		Xls_Reader xl=new Xls_Reader("D:\\TestingFramework\\FrameWork\\src\\test\\resources\\testData\\Practice.xlsx");
//
//		xl.addSheet("dkale");
		MyExcelReader exlreader=new MyExcelReader("D:\\TestingFramework\\FrameWork\\src\\test\\resources\\testData\\Practice.xlsx");
		//mr.addColumn("Raw_Data", "DL");
		String firstname=exlreader.getCellData("Raw_Data", "Name", 2);		
		System.out.println(firstname);
		
		String course=exlreader.getCellData("Raw_Data", "Course", 2);		
		System.out.println(course);
		
		String marks=exlreader.getCellData("Raw_Data", "Marks", 2);		
		System.out.println(marks);
		
		
				
		
	}
}
