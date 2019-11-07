package com.pagesofproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	WebDriver driver;
	
	public PageObjectModel (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//span[contains(text(),'Account & Lists')])[1]")
	private WebElement SigninButton;
	public WebElement getSigninButton() {
		return SigninButton;
	}
	

    @FindBy(xpath="//input[@type='email'][@name='email']")
            private WebElement UserName;
         public WebElement UserName() {
     	return UserName;
}
         
         @FindBy(xpath = "//input[@id='continue']")   //input[@id='continue']
         private WebElement continueButton;
         public WebElement continueButton() {
       	  return SubmitButton;
         }
         
      @FindBy(xpath= "//input[@type='password'][@name='password']")  
      private WebElement PassWord;
      public WebElement PassWord() {
    	  return PassWord;
    	  
      }
      
      @FindBy(xpath = "//input[@id='signInSubmit']")   //input[@id='continue']  ////input[@id='signInSubmit']
      private WebElement SubmitButton;
      public WebElement SubmitButton() {
    	  return SubmitButton;
      }
      
         
         
         
         
         
         
         
         
         
         
         
         
         
}