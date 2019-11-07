package com.pagesofproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuButtonAmazon {
	
	WebDriver Driver;
	
	public MenuButtonAmazon (WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@class='hm-icon nav-sprite']")
	private WebElement MenuButton;
	public WebElement getMenuButton() {
		return MenuButton;
		
		
	}
	
	

}
