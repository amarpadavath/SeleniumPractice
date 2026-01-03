package SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1026 {
	
	public static void main(String arg[])
	{
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
		  WebElement w = driver.findElement(By.name("coffee")); 
		  
		  Select s = new Select(w);
		  
		  s.selectByIndex(3);
		  
	}

}
