package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.commonofproject.CommonProject;
import com.pagesofproject.DropdownAmazonMenu;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepOfDropDown {
	WebDriver driver;
	DropdownAmazonMenu DropMenu;
	
	
	
	@Given("^user already in amazon web page$")
	public void user_already_in_amazon_web_page() throws Throwable {
		driver = CommonProject.getBrowser("Chrome", driver);
		driver.get(CommonProject.getGetURL());
		DropMenu = PageFactory.initElements(driver,DropdownAmazonMenu.class);
		
	   
	    
	}

	@When("^user clicked All search button$")
	public void user_clicked_All_search_button() throws Throwable {
	DropMenu.select();
	   
	    
	}

	@When("^user select one of the menu bar$")
	public void user_select_one_of_the_menu_bar() throws Throwable {
	   DropMenu.select();
	    
	}

	@Then("^user succefully get the page he want$")
	public void user_succefully_get_the_page_he_want() throws Throwable {
	   
	    
	}

}
