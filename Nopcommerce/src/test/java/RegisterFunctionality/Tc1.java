package RegisterFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import computer_functionality.Baseclass;

public class Tc1 extends Baseclass{

	@BeforeMethod
	public void bm() {
		Launch();
		URL("https://demo.nopcommerce.com/");
	}
	
	@Test
	public void te() {
		
		click("//a[text()='Register']");
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ravikumar");
		driver.findElement(By.id("LastName")).sendKeys("Gona");
		
		System.out.println("---total days----");
		List<WebElement> dates=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/option"));
		System.out.println("totla list of dates"+dates.size());
		for(WebElement dt:dates) {
			System.out.println(dt.getText());
		}
		Select se=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
		se.selectByVisibleText("25");
		
		System.out.println("----total mounths----");
		List<WebElement> months=driver.findElements(By.xpath("//select[@name='DateOfBirthMonth']/option"));
		System.out.println("totla list of months"+months.size());
		for(WebElement mo:months) {
			System.out.println(mo.getText());
		}
			Select se1=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
			se1.selectByVisibleText("May");
			
		System.out.println("----total years list-----");
		List<WebElement> year=driver.findElements(By.xpath("//select[@name='DateOfBirthYear']/option"));
		System.out.println("totla list of Years"+year.size());
		for(WebElement ye:year) {
			System.out.println(ye.getText());
		}
			Select se2=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
			se2.selectByVisibleText("1995");
			
		driver.findElement(By.id("Email")).sendKeys("ravikumr.mm013@gmil.com");
		
		driver.findElement(By.name("Company")).sendKeys("BlueLiner Softwre service Pvt Ltd");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
		driver.findElement(By.name("Password")).sendKeys("10179m013");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("10179m013");
		click("//button[text()='Register']");

		
	}
	
	@AfterMethod
	public void am() {
		
	}
	
}
