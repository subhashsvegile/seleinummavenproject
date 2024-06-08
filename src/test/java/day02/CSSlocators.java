package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators{
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		 //tag id     tag#id
	    // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("t-shirts");
	    // (or) driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("t-shirts");
		 
		// tag class     tag.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("shirts")	;	
		
		// tag attribute tag.[attribute='value'] 
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("trousers");
		
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("dress");
		
		((WebElement) driver.findElement(By.cssSelector("img.title='Show details for Apple MacBook Pro 13-inch']"))).click();
		
		driver.findElement(By.cssSelector("button.button-1[type='submit']")).click();	
		
		
		}
}