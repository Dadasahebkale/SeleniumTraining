package com.dk.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dk.basetest.TestBase;
import com.dk.commonmethods.CommonMethods;

public class InquiryRegisterPage1 extends TestBase{

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
	
	@FindBy(id = "menu-item-1870")
	private WebElement inquiryResister;
	
	@FindBy(xpath  = "//*[@id=\"wpforms-1830-field_0\"]")
	private WebElement first_name;
	
	@FindBy(xpath = "//*[@id=\"wpforms-1830-field_1\"]")
	private WebElement emailaddress;
	
	@FindBy(xpath = "//*[@id=\"wpforms-1830-field_7\"]")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//*[@id=\"wpforms-1830-field_10_1\"]")
	private WebElement seleniumcheckbox;
	
	@FindBy(xpath = "//*[@id=\"wpforms-1830-field_10_2\"]")
	private WebElement DevOpsCheckbox;
	
	@FindBy(xpath = "//*[@id=\"wpforms-18301-field_2\"]")
	private WebElement messageBox;
	
	@FindBy(xpath = "//*[@id=\"wpforms-submit-1830\"]")
	private WebElement submitbtn;
	
	public InquiryRegisterPage1() {
		PageFactory.initElements(driver, this);
	
	}
	public InquiryRegisterPage1 InquiryRegisterTest1() {
		CommonMethods.clickCheckBoxAndRadioButton(inquiryregister, "User clicked on Inquiry Register link page");
		return this;
	}
	public InquiryRegisterPage1 getDetailFromExcel1(Hashtable<String, String> hdata) {
		CommonMethods.enterDataToInputBox(first_name, hdata.get("First_Name"), "User entered the first name");
		CommonMethods.enterDataToInputBox(emailaddress, hdata.get("Email_ID"), "User entered the Email_ID");
		CommonMethods.enterDataToInputBox(phonenumber, hdata.get("Contact_No"), "User entered the Contact_No");
		CommonMethods.clickCheckBoxAndRadioButton(seleniumcheckbox, "User Clicked on the seleniumcheckbox");
		CommonMethods.clickCheckBoxAndRadioButton(DevOpsCheckbox, "User Clicked on the DevOpsCheckbox");
		CommonMethods.enterDataToInputBox(messageBox, hdata.get("Message"), "User entered the Message");
		CommonMethods.clickCheckBoxAndRadioButton(submitbtn, "User Clicked the submitbtn");	
		return this;
	}
	
}
