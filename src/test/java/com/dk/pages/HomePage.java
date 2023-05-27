package com.dk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dk.basetest.TestBase;
import com.dk.commonmethods.CommonMethods;

public class HomePage extends TestBase{

	@FindBy(id = "menu-item-3130")
	private WebElement about_us;
	
	@FindBy(id = "menu-item-1743")
	private WebElement training;
	
	@FindBy(id = "menu-item-112")
	private WebElement reviews;
	
	@FindBy(id = "menu-item-1870")
	private WebElement inquiryregister;
	
	@FindBy(id = "menu-item-2439")
	private WebElement feedback;
	
	@FindBy(id = "menu-item-111")
	private WebElement contact_us;
	
	@FindBy(xpath ="//*[text()='Selenium']")
	private WebElement selenium_btn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public HomePage homePageTitle() {
		CommonMethods.getPageTitle("BYMAT Automation - Boost your Mind with Automation Technology");
		return this;
	}
	public HomePage about_usLinkTest() {
		CommonMethods.clickCheckBoxAndRadioButton(about_us, "User clicked on about us link");
		return this;
	}
	public TrainingPage TrainingLinkTest() {
		CommonMethods.clickCheckBoxAndRadioButton(training, "User clicked on Training link page");
		return new TrainingPage();
	}
	public InquiryRegisterPage InquiryRegisterTest() {
		CommonMethods.clickCheckBoxAndRadioButton(inquiryregister, "User Clicked on Inquiry Register link");
		return new InquiryRegisterPage();
	}
	public InquiryRegisterPage getDetailFromExcel() {
		return new InquiryRegisterPage();
	}
	public InquiryRegisterPage1 InquiryRegisterTest1() {
		CommonMethods.clickCheckBoxAndRadioButton(inquiryregister, "User clicked on inquiry register link");
		return new InquiryRegisterPage1();
	}
	public InquiryRegisterPage1 getDetailFromExcel1() {
		return new InquiryRegisterPage1();
}
	public TrainingPage clickOnSeleniumButtonTest() {
		CommonMethods.clickCheckBoxAndRadioButton(selenium_btn, "User clicked on Selenium button");
		return new TrainingPage();
				
	}
}