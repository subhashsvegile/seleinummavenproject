package day06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
	    // implicit wait 
		// it will check the each step of the code until it quit .if response is find before 
	    // the time given it will continue the next step without waiting 
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	  
		driver.get("https://demo.nopcommerce.com/register");
		//  Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='nopCommerce']")).click();

		driver.quit();
		
	}

}
