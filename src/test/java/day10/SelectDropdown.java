package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpCountryEle);

		// select option from the drop down
		//drpCountry.selectByVisibleText("France");
		 drpCountry.selectByValue("France");
		 drpCountry.selectByIndex(0);
		 
		 //capture the option from dropdown
		 
		List<WebElement>options=drpCountry.getOptions();
	}

}
