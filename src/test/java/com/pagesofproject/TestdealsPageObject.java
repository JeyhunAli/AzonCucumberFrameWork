package com.pagesofproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestdealsPageObject {
	
	WebDriver driver;
	
	public TestdealsPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//a[text()=concat('Today',\"'\",'s Deals')]")
	private WebElement TodaysDealButton;
	public WebElement getTodaysDealButton() {
		return TodaysDealButton;
	}
	
	
	

	
	
	

}
