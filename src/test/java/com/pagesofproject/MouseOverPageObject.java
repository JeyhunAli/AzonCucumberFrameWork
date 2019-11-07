package com.pagesofproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MouseOverPageObject {

	WebDriver driver;
	
	public MouseOverPageObject(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//}@FindBy(Xpath = "//a[@id='nav-link-accountList']")private webelement
	//Fashion; public WebElement getfashion() {return Fashion;}
		
	public void mshover()throws InterruptedException{  //write throes and press cntrl and space
	Actions action = new Actions(driver);
	WebElement webE = driver.findElement(By.xpath("//a[@id='nav-link-accountList']")); // this link is of the accoumt aand list
	action.moveToElement(webE).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"))).click().build().perform();
	
	}
	
	
	
	
	
}