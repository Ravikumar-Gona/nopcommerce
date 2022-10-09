package Searchbox_functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class searchbox_tc01 extends Baseclass {

	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
		
		
	}
	@Test
	public void te() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("apple");
		driver.navigate().back();
	//	driver.findElement(By.xpath("//*[text()='Search']")).click();
		
		
	}
	
	@AfterMethod
	public void am() {
		
	}
	
	

}
