package com.pagesofproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellButtonPageObject {
	
	WebDriver driver;
	
	public SellButtonPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[@class='nav-a'][contains(text(),'Sell')]")
	private WebElement sellbutton;
	public WebElement getsellbutton() {
		return sellbutton;
	}
	@FindBy(xpath="//a[text()='Start selling']")
	private WebElement startsellbutton;
	public WebElement getstartsellbutton() {
		return sellbutton;
	}
	
	

}
