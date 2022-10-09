package find_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class totalLinks extends Baseclass {

	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
		
	}
	
	@Test
	public void te() {
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("total links"+links.size());
	
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
	
		}
		
	}
	
	@AfterMethod
	public void am() {
		
	}

}
