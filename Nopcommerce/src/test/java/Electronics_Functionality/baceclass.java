package Electronics_Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baceclass {

	public WebDriver driver;	
	public void Launch() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	public void URL(String url) {
		  driver.get(url);	  
	}
	
	public void sendkeys(String xpath,String keys) {
		  
		  driver.findElement(By.xpath(xpath)).sendKeys(keys);
	}
	public void click(String xpath) {
		
	     driver.findElement(By.xpath(xpath)).click();
	     
	}

}
