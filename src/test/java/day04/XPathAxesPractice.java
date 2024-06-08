package day04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XPathAxesPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		// xpath axes self
		String text= driver.findElement(By.xpath("//a[normalize-space()='Sunteck Realty Ltd.']//self::a")).getText();
	    System.out.println("slef = "+ text);
		
		// xpath parrent
		String text1=driver.findElement(By.xpath("//a[normalize-space()='CarTrade Tech']//parent::td")).getText();
		System.out.println("parent ="+ text1);
		
		//xpath child
		int list = driver.findElements(By.xpath("//a[normalize-space()='CarTrade Tech']//ancestor::tr//child::td")).size();
		System.out.println("children tags  ="+ list);
		
		//xpath Ancestors
		int list2 = driver.findElements(By.xpath("//a[normalize-space()='CarTrade Tech']//ancestor::*")).size();
		System.out.println("ancestor  ="+ list2);
		
		//xpath descendant
		int list3 = driver.findElements(By.xpath("//a[contains(text(),'CarTrade Tech')]//ancestor::tr//descendant::*")).size();
		System.out.println("descendant  ="+ list3);
		
		//xpath following
		int list4 = driver.findElements(By.xpath("//a[contains(text(),'CarTrade Tech')]//ancestor::tr//following::tr")).size();
		System.out.println("follwoing  ="+ list4);	
		
		//xpath preceding
		int list5 = driver.findElements(By.xpath("//a[contains(text(),'CarTrade Tech')]//ancestor::tr//preceding::tr")).size();
		System.out.println("preceding  ="+ list5);	
		
		//xpath following-sibling
	     int list6 = driver.findElements(By.xpath("//a[contains(text(),'CarTrade Tech')]//ancestor::tr//following-sibling::tr")).size();
		 System.out.println("follwoing-sibling  ="+ list6);	
				
		//xpath preceding-sibling
		List<WebElement> list7= driver.findElements(By.xpath("//a[contains(text(),'CarTrade Tech')]//ancestor::tr//preceding-sibling::tr"));
		System.out.println("preceding-sibling  ="+ list7.size());	
		
		// Loop through each element in the list and print its text
        
        	int i=1;
        		for (WebElement row : list7) {
        		System.out.println(i +row.getText()); 
        		i++;
        	}           
       
		
		
		driver.quit();
		
		
	}

}
