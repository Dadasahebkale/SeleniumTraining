package com.dk.pages;

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
//	public TrainingPage clickOnSeleniumButtonTest() {
//		CommonMethods.clickCheckBoxAndRadioButton(selenium_btn, "User clicked on Selenium button");
//		CommonMethods.enterDataToInputBox(firstname, "Dada", "User Enetered first name in the text box");
//		CommonMethods.enterDataToInputBox(lastname, "Kale", "User Enetered Last name in the text box");
//		CommonMethods.enterDataToInputBox(email, "abc@gmail.com", "User Enetered Email in the text box");
//		CommonMethods.clickCheckBoxAndRadioButton(submit, "User clicked on submit button");
//		return this;
//	}
	public TrainingPage clickOnSeleniumButtonTest() {
		CommonMethods.clickCheckBoxAndRadioButton(selenium_btn, "User clicked on Selenium button");
		CommonMethods.enterDataToInputBox(firstname, "Dada", "User Enetered first name in the text box");
		CommonMethods.enterDataToInputBox(lastname, "Kale", "User Enetered Last name in the text box");
		CommonMethods.enterDataToInputBox(email, "abc@gmail.com", "User Enetered Email in the text box");
		CommonMethods.clickCheckBoxAndRadioButton(submit, "User clicked on submit button");
		return this;
	}
}
