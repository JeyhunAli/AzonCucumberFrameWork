package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.commonofproject.CommonProject;
import com.pagesofproject.SellButtonPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SellButtonStepDef {
	WebDriver driver;
	SellButtonPageObject SellButton;
	
	
	
	@Given("^User alredy in Amazon web page$")
	public void user_alredy_in_Amazon_web_page() throws Throwable {
		driver= CommonProject.getBrowser("Chrome", driver);
		driver.get(CommonProject.getGetURL());
		SellButton=PageFactory.initElements(driver, SellButtonPageObject.class);
		}

	@When("^user clicked the sell button$")
	public void user_clicked_the_sell_button() throws Throwable {
		SellButton.getstartsellbutton().click();
	   
	}

	@Then("^user clicked Start selling button$")
	public void user_clicked_Start_selling_button() throws Throwable {
		SellButton.getsellbutton().click();
	
	   
	}
	@Then("^succeffuly opened selling page$")
	public void succeffuly_opened_selling_page() throws Throwable {
		driver.getTitle();
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
	    
		Assert.assertEquals(PageTitle, "Amazon.com: Sell Products Online with Selling on Amazon");
		
	}
	

}
