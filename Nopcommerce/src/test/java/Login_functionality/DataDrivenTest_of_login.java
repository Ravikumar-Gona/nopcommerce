package Login_functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest_of_login {
	WebDriver driver;
	@BeforeMethod
	public void bm() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
  @Test(dataProvider="LoginData")
  public void loginTest(String user,String pass,String exp) {
	  
	  driver.get("https://demo.nopcommerce.com/");
	  
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	  
	WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
	mail.sendKeys(user);
	WebElement pas= driver.findElement(By.xpath("//input[@id='Password']"));
	  pas.sendKeys(pass);
	  
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  
	  
	 

  }
	
@DataProvider(name="LoginData")
public String[][] getData()
{
	
	String loginData[][]= {
			{"admin@yourstore.com","admi", "In valid" },
			{"adn@yourstore.com","admin" ,"In valid" },
			{"admin@ystore.com","adn", "In valid" },
			{"admin@yourstore.com","admin", " valid" },
	};	
			
	return loginData;
}
	@AfterMethod()
	public void Am() {
		
	}
}
