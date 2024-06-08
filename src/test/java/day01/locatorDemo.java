package day01;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorDemo{
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		boolean log=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		System.out.println(log);
		
		//---name
		driver.findElement(By.name("q")).sendKeys("Build your own computer");
		
		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		
		//--linktext& partialLinktext--> in achor tag <a href="http.example.com"> example</a>
		 driver.findElement(By.linkText("Computers")).click();
		
		
		//-- tag and class - it is used to grupo of elemiments (how many links present on page) 
		    WebElement headerMenu = driver.findElement(By.cssSelector(".top-menu.notmobile"));

	        // Find all <a> elements within the header menu
	        List<WebElement> links = headerMenu.findElements(By.tagName("a"));

	        // Print the number of links
	        System.out.println("Total number of links in the header: " + links.size());
	        
	        // Optional: Print each link's text and URL
	        for (WebElement link : links) {
	            System.out.println("Text: " + link.getText() + ", URL: " + link.getAttribute("href"));
	        }
	
			
	        List<WebElement> img=driver.findElements(By.tagName("img"));
	        System.out.println("total no ofimages on page =" + img.size());
	}
}
