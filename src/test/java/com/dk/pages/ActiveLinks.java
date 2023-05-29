package com.dk.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dk.basetest.TestBase;
import com.dk.commonmethods.CommonMethods;

public class ActiveLinks extends TestBase{

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
	
	@FindBy(xpath = "//*[@id=\"wpforms-1830-field_2\"]")
	private WebElement messageBox;
	
	@FindBy(xpath = "//*[@id=\"wpforms-submit-1830\"]")
	private WebElement submitbtn;
	
	@FindBy(xpath = "//div[@class='social-icon-container d-inline-flex']")
	private WebElement Linkedin;
	
	@FindBy(xpath = "//div[@class='social-icon-container d-inline-flex']")
	private WebElement youtube;
	
	@FindBy(xpath = "//div[@class='social-icon-container d-inline-flex']")
	private WebElement facebook;
	
	@FindBy(xpath = "//div[@class='social-icon-container d-inline-flex']")
	private WebElement insta;
	
	public ActiveLinks() {
		PageFactory.initElements(driver, this);
	
	}
	public ActiveLinks AllSocialMediaLink() {
		
		CommonMethods.clickCheckBoxAndRadioButton(Linkedin, "User clicked on Linkdin link");
		return this;
	}
	
}
