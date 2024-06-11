package day08;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxs= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
	  /*for(int i = 0;i<checkboxs.size();i++) {
			checkboxs.get(i).click();
		 } */
		
		
		  for(WebElement checkbox:checkboxs) { 
			  checkbox.click();
			  }
		 Thread.sleep(3000);
		
		for(int i =4; i<checkboxs.size();i++) {
			if(checkboxs.get(i).isSelected()) {
				checkboxs.get(i).click();
			}
		}
	}

}
