package com.dk.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.dk.basetest.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Listeners extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		getDriver();
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case is passed");
		tearDown();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		//System.out.println("Test case is failed");
		test.log(LogStatus.FAIL, result.getThrowable().getMessage());
		ScreenShot();
		tearDown();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
