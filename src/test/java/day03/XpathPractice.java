package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("teshirt");
		
		
		//xpath with multiple attribute
		driver.findElement(By.xpath("//input[@id='search'][@name='q']")).sendKeys("teshirt");
		
		//xpath text() methode
		boolean text=driver.findElement(By.xpath("//*[text()='Shop New Yoga']")).isDisplayed();
		System.out.println(text);
		
		String test2 = driver.findElement(By.xpath("//*[text()='Shop New Yoga']")).getText();
		System.out.println(test2);
		
		driver.findElement(By.xpath("//*[text()='Shop New Yoga']")).click();
		
		//xpath contains , starts-with
		
		driver.findElement(By.xpath("//span[contains(@class,'action more button')]")).click();
		driver.findElement(By.xpath("//span[starts-with(@class,'action')]//*[text()='Shop New Yoga']")).click();
		

	}

}
