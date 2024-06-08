package day05;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodes {

	public static void main(String[] arges) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// get -- open Url on browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// getTitle()  - returs the titile of the page
		String title1 = driver.getTitle();
		if (title1.equals("OrangeHRM")) {
			System.out.println(title1);
		}

		//getCurrentUrl()   --- returns the current url ( for validation of url checks)
	    //driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	    
	    //getPageSource()   ---returns source code of the page ( to check source code validation )
	    // --System.out.println(driver.getPageSource());
	    
	    //getWindowHandle()  --returns id of the single current webpage 
	   // System.out.println(driver.getWindowHandle());
	    
	   // getWindowHandles()   -- returns id's of the multiple  webpages opend on browser
	   driver.findElement(By.xpath("//a[@target='_blank']")).click();
	   Set<String> Ids = driver.getWindowHandles();  // returns set of opened page id's [ id1,id2,id3,...]
	   System.out.println(Ids);   
	   
	   
	    
	    driver.quit();
	}

}
