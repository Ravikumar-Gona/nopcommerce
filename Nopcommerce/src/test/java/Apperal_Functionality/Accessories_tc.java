package Apperal_Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class Accessories_tc extends Baseclass{
	
	@BeforeMethod
	public void bm() {
		
		Launch();
		URL("https://demo.nopcommerce.com/");	
	}
	 
	@Test
	public void te() throws InterruptedException {
		
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
		action.moveToElement(ele).build().perform();
		
		click("//ul[@class='sublist first-level']//a[text()='Accessories ']");
		
		WebElement title=driver.findElement(By.xpath("//div[@class='page-title']/h1"));
		if(title.equals("Accessories")) {
			System.out.println("title is displayed on the page");
		}
		else {
			System.out.println("title is not displayed on the page");
		}
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
				click("//a[text()='Reversible Horseferry Check Belt']");
				
				click("//a[text()='1 review(s)']");
				Thread.sleep(2000);	
				  js.executeScript("window.scrollBy(0,350)", "");
				
				click("//input[@id='addproductrating_1']");
				click("//input[@id='addproductrating_2']");
				click("//input[@id='addproductrating_3']");
				click("//input[@id='addproductrating_4']");
				click("//input[@id='addproductrating_5']");
		
	}
	
	@AfterMethod
	public void am() {
		
	}
	
}
