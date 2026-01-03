package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1025 {
	
	public static void main(String arg[])
	{
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
		  WebElement w = driver.findElement(By.name("coffee")); 
		  
		  Select s = new Select(w);
		  
		 List<WebElement>  n = s.getOptions();
		 
		 for(int i=0;i<n.size();i++)
		 {
			 System.out.println(n.get(i).getAttribute("value"));
		 }
		  
	}

}
