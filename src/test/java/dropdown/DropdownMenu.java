package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {
	
	WebDriver driver;
    public DropdownMenu(WebDriver driver) {
	  
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
   public void select() {
	   Select slt =  new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	   
	   		slt.selectByVisibleText("Baby");
	   WebElement we = slt.getFirstSelectedOption();
	   System.out.println(we);
	   System.out.println("==============");
	   List<WebElement>option = slt.getOptions();
	   System.out.println(option.size());
	   System.out.println("=======");
	   for(int i=0;i<option.size();i++) {
		   System.out.println(option.get(i).getText());
	   }
	   
   }

}
