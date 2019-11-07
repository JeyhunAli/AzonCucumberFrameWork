package com.commonofproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CommonProject {
	
	private static String getURL = "https://www.amazon.com/";

	public static String getGetURL() {
		return getURL;
	}
	
	WebDriver Driver;
	
	public static WebDriver getBrowser(String BrowserName, WebDriver driver) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		 if (BrowserName.equalsIgnoreCase("Opera")) {
			System.setProperty("webdriver.opera.driver", "./Browsers/OperaSetup.exe");
			driver = new OperaDriver();
			}
		
		else if(BrowserName.equalsIgnoreCase("geckodriver")) {
			System.setProperty("webdriver.gecko.driver", "./Browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;
		
	}

	}
