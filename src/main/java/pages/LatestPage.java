package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.webdriverfactory;


public class LatestPage
{
 WebDriver driver;

private By movetochampionship=By.xpath("(//button[text()='hampionships'])[1]");
private By selectchampionship=By.xpath("//a[@class='s-list-item s-alignment--left']");

	  	
	   public LatestPage(WebDriver driver)
	   {
		   this.driver=driver;	
		   PageFactory.initElements(driver,this);
	   }
	   
	   public String getLoginPageTitle()
	   {
		   return driver.getTitle();
	   }
		public void navigate_championship()
		{					
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(movetochampionship)).build().perform();
			
		}
		
		public void select_championship(String selectChampionship) throws Exception
		{
		List<WebElement> verifychampionship=driver.findElements(selectchampionship);
  		  
            int size=verifychampionship.size();
            System.out.println(size);
            for (int i = 0; i < size; i++) 
            {
                String verify = verifychampionship.get(i).getText();
                System.out.println(verify);
                
                if (verify.equalsIgnoreCase(selectChampionship)) 
                {
                	verifychampionship.get(i).click();
                	Thread.sleep(5000);
                    break;
                } 
                
             }
      	
 	   
		}
		
}
