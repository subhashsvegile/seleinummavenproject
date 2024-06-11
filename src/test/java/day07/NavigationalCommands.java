package day07;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();

		// driver.navigate().to("https://demo.nopcommerce.com/");
		// driver.get("https://demo.nopcommerce.com/"); // accepts URL only in the string format

		URL myurl = new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myurl);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	
	}

}
