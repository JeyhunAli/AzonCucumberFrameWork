package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.commonofproject.CommonProject;
import com.pagesofproject.PageScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsScreenShot {
	WebDriver driver;
	PageScreenShot ScreenShot;

	@Given("^user alredy in Amazon Web page$")
	public void user_alredy_in_Amazon_Web_page() throws Throwable {
		driver = CommonProject.getBrowser("Chrome", driver);
		driver.get(CommonProject.getGetURL());
		ScreenShot = PageFactory.initElements(driver,PageScreenShot.class);
	  
	}

	@When("^user put mouseover the Account and list button$")
	public void user_put_mouseover_the_Account_and_list_button() throws Throwable {
	  
	}

	@When("^user clicked Your Prime Membership link$")
	public void user_clicked_Your_Prime_Membership_link() throws Throwable {
		ScreenShot.ss(driver, "YourPrimeVideo");

		
	}
	@Then("^user Succeffully took a screen shot$")
	public void user_Succeffully_took_a_screen_shot() throws Throwable {
		ScreenShot.ss(driver, "Your Prime Video");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();
	}

	}

