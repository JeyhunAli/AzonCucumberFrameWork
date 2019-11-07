package com.pagesofproject;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageScreenShot {
	
	 WebDriver driver;
	public PageScreenShot(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
  public void mouseover()throws InterruptedException{
	  Actions act = new Actions(driver);
	  WebElement WebE = driver.findElement(By.xpath("//div[@id='nav-tools']"));
	  act.moveToElement(WebE).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Prime Video')]")));
  }
  
public void ss(WebDriver driver,String YourPrimeVideo)throws Throwable{
	TakesScreenshot tkss = (TakesScreenshot)driver;
	File file = tkss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:/Users/Ali-c/eclipse-workspace/TestingWebpagesProject/src/test/java/com/commonofproject/"+YourPrimeVideo+".jpg"));
	
	
	  
}





}