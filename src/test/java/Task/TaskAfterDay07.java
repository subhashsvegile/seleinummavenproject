package Task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAfterDay07 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input")).sendKeys("Hcl");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		WebElement searchresults = driver.findElement(By.cssSelector(".wikipedia-search-main-container"));

		List<WebElement> links = searchresults.findElements(By.tagName("a"));

		System.out.println("total no of links =" + links.size());

		for (WebElement link : links) {
			link.click();
		}

		Set<String> windowID = driver.getWindowHandles();
		List<String> WinID = new ArrayList(windowID);

		for (String windowsID : WinID) {

			String title = driver.switchTo().window(windowsID).getTitle();
			System.out.println("titile = " + title + " and ID =" + windowsID);

			if (title.equals("HCL Sametime - Wikipedia")) {
				driver.close();
			}

		}

	}

}
