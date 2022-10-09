package Searchbox_functionality;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class click_SubmitButton_tc02 extends Baseclass{
	
	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
		
		
	}
	@Test
	public void te() throws InterruptedException {
	
			driver.findElement(By.xpath("//*[text()='Search']")).click();
	     Alert alert=driver.switchTo().alert();
	     alert.accept();
			
			
		//	driver.findElement(By.xpath("")).click();
		
		
	}
	
	@AfterMethod
	public void am() {
		
	}
	

}
