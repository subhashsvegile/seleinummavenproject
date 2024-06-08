package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMedthods {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(5000);
		
		//-- isDisplyed();  applicable for all types of elements. ----//
		
		//WebElement log = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display Status of the log = "+ log.isDisplayed());
		
		//boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("Display Status of the log = "+ status);
		
		
		//isEnabled();  
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status = "+ status);
		
		//isSelected() ------------- for radio buttons/check boxs/ dropdowns
		/*
		 * boolean Button_status2 =
		 * driver.findElement(By.cssSelector("#gender-male")).isSelected();
		 * System.out.println("Radiobutton status = "+ Button_status2);
		 * driver.findElement(By.cssSelector("#gender-male")).click(); boolean
		 * Button_status3 =
		 * driver.findElement(By.cssSelector("#gender-male")).isSelected();
		 * System.out.println("Radiobutton status = "+ Button_status3);
		 */
		
		
		WebElement radiobutton = driver.findElement(By.cssSelector("#gender-male"));
		System.out.println("Radiobutton status = "+ radiobutton.isSelected());
		radiobutton.click();
		System.out.println("Radiobutton status = "+ radiobutton.isSelected());
		
		driver.close();
	}

}
