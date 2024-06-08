package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    
	    //xpath with single attribute 
	  //  driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("tshirts");
	    
		//xpath with multiple attributes 
	    driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("tshirts");
	    
	    // xpath with text() ( using innertext)
	    driver.findElement(By.xpath("//*[text()='Search']")).click();
	    
	    
	    boolean textdisplyed=driver.findElement(By.xpath("//*[text()='Computers']")).isDisplayed();
	    System.out.println(textdisplyed);		
	    
	    
	    String value=driver.findElement(By.xpath("//*[text()='Computers']")).getText();
	    System.out.println(value);
	    
	    
	    
	    //xpath with contains , starts-with
	    driver.findElement(By.xpath("//*[conatins(@placeholder,'sea')")).sendKeys("jeans");
	    driver.findElement(By.xpath("//*[starts-with(@placeholder,'sea')")).sendKeys("jeans");
	    

	}

}
