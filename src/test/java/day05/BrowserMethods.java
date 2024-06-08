package day05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='nopCommerce']")).click();
		
		//driver.close(); //closes current page where driver is focused
		  driver.quit();// closes all pages opened under browser.
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			
	}

}
