package SeleniumPractice0;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1020 {

	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver(); 
		 
		  driver.get("https://www.google.com/"); 
		 
		  driver.manage().window().maximize(); 
		 
	//	  List<WebElement> x = driver.findElements(By.tagName("a")); 
		 
		  List<WebElement> x = driver.findElements(By.tagName("a"));
		   
		  // To find the count of the link 
		  System.out.println(x.size()); 
		   
		  // To print all links 
		    for (WebElement x1 : x) { 
		      
		     System.out.println(x1.getAttribute("href")); 
		      
		    } 
	}
}
