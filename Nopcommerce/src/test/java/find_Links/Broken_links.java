package find_Links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class Broken_links extends Baseclass {
	
	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
		
	}
	
	@Test
	public void te() throws MalformedURLException {
		
		List<WebElement> broken_links=driver.findElements(By.tagName("a"));
		   int brokenlinks=0;
		   for(WebElement element:broken_links)
		   {
			   String url=element.getAttribute("href");
			   if(url==null||url.isEmpty()) {
				   System.out.println("url is Empty");
				   continue;
				   }
			   URL link=new URL(url);
			   try {
				   HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
				 
				httpconn.connect();
				if(httpconn.getResponseCode()>400) {
					System.out.println(httpconn.getResponseCode()+url+"is"+"Brokenlinks");
					brokenlinks++;
				}
				else
				{
					System.out.println(httpconn.getResponseCode()+url+"is"+"validlink");
				}
				
			} catch (Exception e) {
		   }
		   }
		   System.out.println("broken no of links:"+brokenlinks);
		   driver.quit();
		
		
		
		
		
		
		
	}
	@AfterMethod
	public void am() {
		
	}

}
