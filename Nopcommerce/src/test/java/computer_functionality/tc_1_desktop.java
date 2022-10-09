package computer_functionality;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc_1_desktop extends Baseclass{
	
	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
	}
	
	@Test
	public void te() throws InterruptedException {
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	    if(logo.equals("nopCommerce"))
	    {
	    	System.out.println("logo is displayed on the page");
	    }
	    else {
	    	System.out.println("logo is not displayed on the page");
	    }
		
		Actions action=new Actions(driver);
		
	WebElement ele=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
	action.moveToElement(ele).build().perform();
	
	List<WebElement> mouse=driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li/a"));
	    System.out.println("Total mouse elements:"+mouse.size());
	    
	    
	    String mainwindow=driver.getWindowHandle();
		ArrayList <String>allwindowa=new ArrayList<String>(driver.getWindowHandles());
	    
	click("//ul[@class='sublist first-level']/li/a");    
	
	WebElement drown=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	String str=drown.getText();
	System.out.println("total dropdown Elemnt:"+str);
	String s[]=str.split("\n");

		System.out.println(s.length);
	Select se=new Select(driver.findElement(By.xpath("//select[@aria-label='Select product sort order']")));
	se.selectByVisibleText("Name: A to Z");
	
	driver.navigate().refresh();
	driver.findElement(By.xpath("//h2[@class='product-title']//a[text()='Build your own computer']")).click();
	
	WebElement drown1=driver.findElement(By.xpath("//select[@name='product_attribute_1']/option"));
	String str1=drown1.getText();
	System.out.println("total dropdown Elemnt:"+str1);
	String s1[]=str1.split("\n");

		System.out.println(s1.length);
	Select se1=new Select(driver.findElement(By.name("product_attribute_1")));
	se1.selectByVisibleText("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
	
	WebElement drown2=driver.findElement(By.xpath("//select[@name='product_attribute_2']/option"));
	String str2=drown2.getText();
	System.out.println("total dropdown Elemnt:"+str2);
	String s2[]=str2.split("\n");

		System.out.println(s2.length);
	Select se2=new Select(driver.findElement(By.name("product_attribute_2")));
	se2.selectByVisibleText("8GB [+$60.00]");
	
	System.out.println("-------------Total check boxes----------");
	List<WebElement> chbox=driver.findElements(By.xpath("//ul[@data-attr='5']/li/input"));
	System.out.println("Total ch boxes:"+chbox.size());
	
	for(WebElement box:chbox) {
		box.click();	
	}
	
	
	
		click("//a[text()='1 review(s)']");
	  WebElement logo1=driver.findElement(By.xpath("//div[@class='page-title']/h1/a"));
	  if(logo1.equals("Product reviews for Build your own computer")) 
	  {
	  System.out.println("Logo is not displayed on the page");
	  }
	  else {
	  System.out.println("Logo is displayed on the page");
	  }
	//  driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("ravikumatr");
	 // driver.findElement(By.name("AddProductReview.ReviewText")).sendKeys("hello world");
	  click("//input[@id='addproductrating_1']");
	  Thread.sleep(2000);
	  click("//input[@id='addproductrating_2']");
	  Thread.sleep(2000);
	  click("//input[@id='addproductrating_3']");
	  Thread.sleep(2000);
	  click("//input[@id='addproductrating_4']");
	  Thread.sleep(2000);
	  click("//input[@id='addproductrating_5']");
	 
	  
	  
	
	
	
	
	
	
	}

	
	@AfterMethod
	public void Am() {
		
	}
}
