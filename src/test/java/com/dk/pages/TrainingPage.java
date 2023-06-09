package com.dk.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dk.basetest.TestBase;
import com.dk.commonmethods.CommonMethods;

public class TrainingPage extends TestBase{

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
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@class='hustle-button-text']")
	private WebElement submit;
	
	public TrainingPage() {
		PageFactory.initElements(driver, this);
	
	}
	public TrainingPage TrainingLinkTest() {
		CommonMethods.clickCheckBoxAndRadioButton(training, "User clicked on Training link page");
		return this;
	}
	public TrainingPage clickOnSeleniumButtonTest(Hashtable<String, String> hdata) {
		CommonMethods.clickCheckBoxAndRadioButton(selenium_btn, "User clicked on Selenium button");
		CommonMethods.enterDataToInputBox(firstname,hdata.get("First_Name"),"User Entered the first name");
		CommonMethods.enterDataToInputBox(lastname, hdata.get("Last_Name"), "User Enetered Last name in the text box");
		CommonMethods.enterDataToInputBox(email, hdata.get("Email_ID"), "User Enetered Email in the text box");
		CommonMethods.waitForElementtoAppear(submit);
		CommonMethods.clickCheckBoxAndRadioButton(submit, "User clicked on submit button");
		return this;
	}
}
