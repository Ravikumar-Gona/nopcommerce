package Login_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class tc_01  extends Baseclass{

	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
	}
	@Test
	public void te() throws InterruptedException {
	
		click("//a[text()='Log in']");
	  WebElement title= driver.findElement(By.xpath("//div[@class='page-title']//*[text()='Welcome, Please Sign In!']"));
	  if(title.equals("Welcome, Please Sign In!"))
	     System.out.println("title is displayed on the page");
	  else
		  System.out.println("title is not displayed on the page");
	
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ravikumar.mm013@gmail.com");
	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("10179m013");
	  click("//input[@id='RememberMe']");
	  click("//button[text()='Log in']");
	  
	  
	
	}
	
	@AfterMethod
	public void am() {
		
	}
	
	

}
