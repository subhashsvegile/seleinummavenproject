package day08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
	    
	    //normal alert with ok button
	        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	        Thread.sleep(5000);
	         driver.switchTo().alert().accept();
	    
				/*
				 * driver.switchto().alert(); - driver switches to alert pop -up
				 * driver.switchto().alert().accept() - it will select the ‘ok ‘ option on
				 * alert. driver.switchto().alert().dismiss() - it will select the ‘cancel’
				 * button on alert driver.switchto().alert().gettext() - it will reuters the
				 * text on alert pop-up
				 * 
				 * driver.switchto().alert().sendKeys() – it will accept the text into alert
				 * input box
				 */

	         

	}

}
