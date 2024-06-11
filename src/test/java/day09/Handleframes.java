package day09;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handleframes {
    public static void main(String[] args) {
        // Create a ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

        // Start ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);
       
		
		  try { 
			  // Use CDP (Chrome DevTools Protocol) to set the zoom level to 80%
		  Map<String, Object> params = new HashMap<>(); 
		  params.put("width", 1700); // 1700 
		  params.put("height", 1700); // 1200 
		  params.put("deviceScaleFactor",
		  1.0); 
		  // Keep the device scale factor 
		  params.put("mobile", false);
		  params.put("scale", 0.8); // 0.8 represents 80% zoom level
		  ((ChromiumDriver)driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", params);
		  
		  // Navigate to a website to verify the zoom level
		  driver.get("https://ui.vision/demo/webtest/frames/");
		  
		  System.out.println("Navigated to the website.");
		  
		  } finally { // This block can be used to clean up, if necessary
		  System.out.println("zoom adjustment done"); }
		 
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Frame 1
        WebElement frame1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@src='frame_1.html']")));
        driver.switchTo().frame(frame1);
        System.out.println("Switched to Frame 1.");
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
        System.out.println("Entered text in Frame 1.");
        driver.switchTo().defaultContent();

        // Frame 2
        WebElement frame2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@src='frame_2.html']")));
        driver.switchTo().frame(frame2);
        System.out.println("Switched to Frame 2.");
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
        System.out.println("Entered text in Frame 2.");
        driver.switchTo().defaultContent();

        // Frame 3
        WebElement frame3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(frame3);
        System.out.println("Switched to Frame 3.");
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
        System.out.println("Entered text in Frame 3.");

        // inner iframe - part of frame 3
        driver.switchTo().frame(0); // switching to frame using index
        System.out.println("Switched to inner iframe inside Frame 3.");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")));
        
        // Scroll into view and click
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Scrolled to the element inside inner iframe.");
        element.click();
        System.out.println("Click action performed on the element inside inner iframe.");
        
        driver.switchTo().defaultContent();

        // Frame 5
        WebElement frame5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@src='frame_5.html']")));
        driver.switchTo().frame(frame5);
        System.out.println("Switched to Frame 5.");
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Java");
        System.out.println("Entered text in Frame 5.");
        
        // Ensure the link is clickable
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='https://a9t9.com']")));
        
        js.executeScript("arguments[0]", element2);
        System.out.println("Scrolled to the link in Frame 5.");
        element2.click();
 
        // Verify the click action
        System.out.println("Link click action performed.");
        
        Set<String> WindowID= driver.getWindowHandles();
        List<String> windowList = new ArrayList(WindowID);
         
		 String ID = windowList.get(0);
		 driver.switchTo().window(ID);
		 System.out.println(ID);
		 
//         
//		WebElement element3=driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
//		
//		 js.executeScript("arguments[0].scrollIntoView(true);", element3); 
//		 boolean t = element3.isDisplayed();
//		 System.out.println("image display status :"+t);
		 

        // Close the browser
        // driver.quit();
    }
}
