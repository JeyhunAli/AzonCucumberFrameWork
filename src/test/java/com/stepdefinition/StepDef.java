package com.stepdefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.commonofproject.CommonProject;
import com.pagesofproject.PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	
	WebDriver driver;
	PageObjectModel Pf;
	

		

@Given("^When I am On Amazon Web page$")
public void when_I_am_On_Amazon_Web_page() throws Throwable {
	driver = CommonProject.getBrowser("Chrome", driver);
	driver.get(CommonProject.getGetURL());
	Pf = PageFactory.initElements(driver,PageObjectModel.class);
	
	
}

@When("^user able to sign in$")
public void user_able_to_sign_in() throws Throwable {
	Pf.getSigninButton().click();
	
	
   
}

@When("^user enter username$")
public void user_enter_username() throws Throwable {
    Pf.UserName().sendKeys("jeyhunaliyev01@gmail.com");
   
} 
    
    @When("^user click to continue button$")
    public void user_click_to_continue_button() throws Throwable {
      Pf.continueButton().click();
      driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
      

  
}

@When("^user enter password$")
public void user_enter_password() throws Throwable {
	Pf.PassWord().sendKeys("asderfgty5758");
   
}


@When("^user click to sign in button$")
public void user_click_to_sign_in_button() throws Throwable {
	Pf.SubmitButton().click();
//	System.out.println(Pf.SubmitButton().getText());
//	Thread.sleep(3000);
//	//driver.quit();
//	

}

@Then("^user able successfully log in$")
public void user_able_successfully_log_in() throws Throwable {
	driver.getTitle();// Getting Title of the page
	String pageTitle=driver.getTitle();// Store title in the String variables
	System.out.println(pageTitle);// Print Page title
	
	if (driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
		//Compare runtime Page title with given pageTitle with .equals method to compare String Value and 
		//.equalsIgnoreCase method for ignore case sensitivity
		System.out.println("My Page Validation Pass ");
		
	}else 
		System.out.println("My Page Validation Fail");
   
	
	Assert.assertEquals(pageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
         
   
}

}
