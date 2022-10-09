package computer_functionality;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc_2_Notebooks extends Baseclass{
	
	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
	}
	
	@Test
	public void tes() throws InterruptedException {
		
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Computers ']"));
		action.moveToElement(ele).build().perform();
		
		click("//ul[@class='top-menu notmobile']/li/ul/li[2]/a");
		
	  WebElement title= driver.findElement(By.xpath("//div[@class='page-title']/h1"));
	  if(title.equals("Notebooks")) {
		  System.out.println(" title is displayed in the page");
	  }
	  else {
		  System.out.println("Title is not displayed on the page");
	  }
	   List<WebElement> list=driver.findElements(By.xpath("//select[@name='products-orderby']/option"));
	   System.out.println("Total list"+list.size());
	   for(WebElement li:list) {
		   System.out.println(li.getText());
		   if(li.getText().contains("Name: A to Z")) {
			   li.click();
		   }
		   
		   List<WebElement> list1=driver.findElements(By.xpath("//select[@name='products-pagesize']/option"));
		   System.out.println("Total list"+list1.size());
		   for(WebElement li1:list1) {
			   System.out.println(li1.getText());
			   if(li1.getText().contains("6")) {
				   li1.click();
			   }
		   
		   click("//a[text()='List']");
		      
		      JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("window.scrollBy(0,1000)", "");
			   
		      driver.navigate().refresh();
		      click("//h2[@class='product-title']//a[text()='Samsung Series 9 NP900X4C Premium Ultrabook']");
		      driver.navigate().refresh();
		   click("//a[text()='1 review(s)']");
		  
		      js.executeScript("window.scrollBy(0,350)", "");
		/*	   
		   driver.navigate().refresh();
		   click("//input[@id='addproductrating_1']");
	
		   click("//input[@id='addproductrating_2']");

		   click("//input[@id='addproductrating_3']");
		  
		   click("//input[@id='addproductrating_4']");
		  
	        click("//input[@id='addproductrating_5']");
		
		 */
		   
		      }
	   }}
	   

   
	
	   
	   
		
	
	
	
	@AfterMethod
	public void Am() {

			
	}

}
