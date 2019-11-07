package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.commonofproject.CommonProject;
import com.pagesofproject.TestdealsPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsOfDealsButton {
	
	WebDriver driver;
	TestdealsPageObject TD;
	
	
	
	@Given("^User alredy on amazon web page$")
	public void user_alredy_on_amazon_web_page() throws Throwable {
	  driver =  CommonProject.getBrowser("Chrome", driver);
	  driver.get(CommonProject.getGetURL());
	  TD = PageFactory.initElements(driver,TestdealsPageObject.class);
			  
	 
	}

	@When("^user Click on the Todays deal button$")
	public void user_Click_on_the_Todays_deal_button() throws Throwable {
		TD.getTodaysDealButton().click();
	   
	 
	}

	@Then("^user succeffuly get the page of todays deal$")
	public void user_succeffuly_get_the_page_of_todays_deal() throws Throwable {
		 String Title = driver.getTitle();
         System.out.println("my test test cases title name is :"+ Title);
         if (driver.getTitle().equalsIgnoreCase("DealsPage")) {
        	 System.out.println("my test passed");
        	 
        	  }
         else System.out.println("my test fail");
         
		
	   
	 
	}


}
