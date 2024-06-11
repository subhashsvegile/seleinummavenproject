package day07;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize(); 
	    
	    driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	    
		
		  Set<String> WindowID= driver.getWindowHandles();
		  
		  //approch 01 , taking in list and calling separatly 
		  
			/*
			 * List<String> windowList = new ArrayList(WindowID);
			 * 
			 * String parentID = windowList.get(0); System.out.println(parentID); String
			 * childID = windowList.get(1); System.out.println(childID);
			 * 
			 * driver.switchTo().window(childID); System.out.println(driver.getTitle());
			 * driver.navigate().refresh();
			 */
		 
		  //approch to -- looping 
		  
		  for(String winID:WindowID) {
			String title = driver.switchTo().window(winID).getTitle();
            if(title.equals("OrangeHRM")) {
            System.out.println(driver.getCurrentUrl());
            }
            
            if(title.equals("Human Resources Management Software | OrangeHRM")) {
  			driver.close();  
  		    };
		  } 
		 
	}

}
