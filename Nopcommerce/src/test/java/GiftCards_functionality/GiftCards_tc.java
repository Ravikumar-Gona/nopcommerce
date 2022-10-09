package GiftCards_functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class GiftCards_tc extends Baseclass {
	
	@BeforeMethod
	public void bm() {
		
		Launch();
		URL("https://demo.nopcommerce.com/");	
	}
	 
	@Test
	public void te() throws InterruptedException {
	
		click("//ul[@class='top-menu notmobile']/li[7]");
	
		System.out.println("------dropdown list 1------");
		List<WebElement> list=driver.findElements(By.xpath("//select[@name='products-orderby']/option"));
		System.out.println("dropdown list:"+list.size());
		for(WebElement li:list) {
			System.out.println(li.getText());
			if(li.getText().contains("Created on")) {
				li.click();
				break;
			}}
			System.out.println("------dropdown list 2------");
			List<WebElement> list1=driver.findElements(By.xpath("//select[@name='products-pagesize']/option"));
			System.out.println("dropdown list:"+list1.size());
			for(WebElement li1:list1) {
				System.out.println(li1.getText());
				if(li1.getText().contains("9")) {
				 li1.click();
				break;
			}}
			
				click("//a[text()='List']");
				Thread.sleep(2000);	
				
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				   js.executeScript("window.scrollBy(0,550)", "");
				   Thread.sleep(1000);	
				click("//a[text()='$100 Physical Gift Card']");
				
			driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Gift");
		    driver.findElement(By.id("giftcard_45_SenderName")).sendKeys("ravi");
		    driver.findElement(By.id("giftcard_45_Message")).sendKeys("hi greetings of the day");
		    
		    Actions action= new Actions(driver);
		    WebElement mov=driver.findElement(By.xpath("//*[@aria-labelledby='at-svg-addthis-1']"));
		    action.moveToElement(mov).click().perform();
		    
		    driver.findElement(By.id("at-expanded-menu-service-filter")).sendKeys("Linkidin");
				click("//span[@class='at-expanded-menu-search-icon']");
	}
	
	@AfterMethod
	public void am() {
		
	}
	
	
	

}
