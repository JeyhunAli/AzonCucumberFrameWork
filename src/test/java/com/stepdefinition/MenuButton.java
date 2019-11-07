package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.commonofproject.CommonProject;
import com.pagesofproject.MenuButtonAmazon;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dropdown.DropdownMenu;

public class MenuButton {
	
	WebDriver driver;
	MenuButtonAmazon MB;
	
	DropdownMenu Db;
	
	
	@Given("^User alredy on Amazon Web Page$")
	public void user_alredy_on_Amazon_Web_Page() throws Throwable {
	 driver = CommonProject.getBrowser("Chrome", driver);
	 driver.get(CommonProject.getGetURL());
	  //MB=PageFactory.initElements(driver, MenuButtonAmazon.class);
	  Db=PageFactory.initElements(driver, DropdownMenu.class);
	  
	}

	@When("^User clicked on Menu button$")
	public void user_clicked_on_Menu_button() throws Throwable {
		MB.getMenuButton().click();
	 Db.select();
	    
	}

	@Then("^menu button Successfully opened$")
	public void menu_button_Successfully_opened() throws Throwable {
	 
		driver.getTitle();// Getting Title of the page
		String pageTitle=driver.getTitle();// Store title in the String variables
		System.out.println(pageTitle);// Print Page title
		
	
		if (driver.getTitle().equalsIgnoreCase("amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			//Compare runtime Page title with given pageTitle with .equals method to compare String Value and 
			//.equalsIgnoreCase method for ignore case sensitivity
			System.out.println("My Page Validation Pass ");
			
		}else 
			System.out.println("My Page Validation Fail");
	   
		
		Assert.assertEquals(pageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");//TestNG validation
	}
	// Home works is comparing URL and show console validation???????
	
	   
	

	 
	

}