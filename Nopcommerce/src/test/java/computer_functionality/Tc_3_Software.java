package computer_functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc_3_Software extends Baseclass{
	
	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");	
	}
	@Test
	public void te() throws InterruptedException {
		
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		action.moveToElement(ele).build().perform();
		
		click("//ul[@class='sublist first-level']//a[text()='Software ']");
	/*	
		WebElement title=driver.findElement(By.xpath("class=\"page-title"));
		 if(title.equals("Software"))
		 {
			   System.out.println("Page Title is displayes on the page");
		   }
		 else 
		 {
			   System.out.println("PageTitle is not displayed on the Page");
		   }*/
		  
		   System.out.println("---------Dropdowns----------");
		   List<WebElement> dropdown=driver.findElements(By.xpath("//select[@aria-label='Select product sort order']/option"));
		   System.out.println("List of dropdown:"+dropdown.size());
		   for(WebElement se:dropdown) {
			   System.out.println(se.getText());
			   
			   if(se.getText().contains("Name: Z to A")) {
				   se.click();
				   break;
			   }
		   }
		   
		   List<WebElement> drop=driver.findElements(By.xpath("//select[@id='products-pagesize']/option"));
		   System.out.println("List of dropdown:"+dropdown.size());
		   for(WebElement se1:drop) {
			   System.out.println(se1.getText());
			   
			   if(se1.getText().contains("9")) {
				   se1.click();
				   break;
			   }
		   }   
		   click("//*[text()='List']");
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   driver.navigate().refresh();
		   click("//a[text()='Windows 8 Pro']");  
		   click("//a[text()='1 review(s)']");
		   Thread.sleep(1000);
		   click("//div[@class='rating-options']//input[@value='1']");
		    
		   Thread.sleep(1000);
		   click("//div[@class='rating-options']//input[@value='2']");
		    
		   Thread.sleep(1000);
		   click("//div[@class='rating-options']//input[@value='3']");
		    
		   Thread.sleep(1000);
		   click("//div[@class='rating-options']//input[@value='4']");
		   Thread.sleep(1000);
		   click("//div[@class='rating-options']//input[@value='5']");
		   
	}
	
	
	@AfterMethod
	
    public void am() {
			
	}
	

}
