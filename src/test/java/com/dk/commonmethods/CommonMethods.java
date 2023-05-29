package com.dk.commonmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dk.basetest.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class CommonMethods extends TestBase{
public static void clickCheckBoxAndRadioButton(WebElement element, String message) {
		
		element.isDisplayed();
		element.click();
		System.out.println(message);
		test.log(LogStatus.PASS, message);
	}
	
	public static void enterDataToInputBox(WebElement element, String data,String message) {
		
		element.isDisplayed();
		element.sendKeys(data);
		System.out.println(message);
		test.log(LogStatus.PASS, message);
	}
	
	public static void getPageTitle(String pageTitle) {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),pageTitle);
		test.log(LogStatus.PASS, pageTitle);
	}
	public static void selectValueByText(WebElement element, String text, String message) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		test.log(LogStatus.PASS, message);
	}
	public static void selectValueByIndex(WebElement element, int index, String message) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
		test.log(LogStatus.PASS, message);
	}
	public static void selectValueByVisibleText(WebElement element, String text, String message) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
	test.log(LogStatus.PASS, message);
}
public static void waitForme() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
