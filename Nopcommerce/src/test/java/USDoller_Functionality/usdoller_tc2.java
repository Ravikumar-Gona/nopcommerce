package USDoller_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class usdoller_tc2 extends Baseclass {
	
	@BeforeMethod
	public void bm() {
		
		Launch();
		URL("https://demo.nopcommerce.com/");
	}
	
	@Test
	public void te() {
		System.out.println("---total days----");
		WebElement drop=driver.findElement(By.xpath("//select[@name='customerCurrency']"));
		
		String s=drop.getText();
		System.out.println(s);
		String[] str=s.split("\n");
		System.out.println(str.length);
		
		Select se=new Select(driver.findElement(By.xpath("//select[@name='customerCurrency']")));
		se.selectByVisibleText("US Dollar");
	}
	
	@AfterMethod
	public void am() {
		
	}
	

}
