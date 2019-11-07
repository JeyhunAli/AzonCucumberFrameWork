package com.stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.commonofproject.CommonProject;
import com.pagesofproject.MouseOverPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MouseOverStepDef {
	
	WebDriver driver;
	MouseOverPageObject MHV;
	 
	@Given("^user alredy in Amazon web page$")
	public void user_alredy_in_Amazon_web_page() throws Throwable {
		driver = CommonProject.getBrowser("Chrome", driver);
		driver.get(CommonProject.getGetURL());
		MHV = PageFactory.initElements(driver,MouseOverPageObject.class);
	  
	}

	@When("^user put mouse over the Account and list button$")
	public void user_put_mouse_over_the_Account_and_list_button() throws Throwable {
		
	   
	}

	@When("^user click your Account link$")
	public void user_click_your_Account_link() throws Throwable {
		MHV.mshover();
	
	}

	@Then("^user succeffuly get the page he want$")
	public void user_succeffuly_get_the_page_he_want() throws Throwable {
	  
	}

}
