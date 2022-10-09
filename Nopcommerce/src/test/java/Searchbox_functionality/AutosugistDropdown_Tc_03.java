package Searchbox_functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class AutosugistDropdown_Tc_03 extends Baseclass{

	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
		
		
	}
	@Test
	public void te() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("apple");
		Thread.sleep(3000);
		List<WebElement> textbox=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(textbox.size());
		for(WebElement tx:textbox) {
			System.out.println(tx.getText());
			if(tx.getText().contains("Apple iCam")) {
		     tx.click();
		     break;
			}
		}
		
		
		
		
	}
	
	@AfterMethod
	public void am() {
		
	}
	
	
}
