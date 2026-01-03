package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1024 {
	
	public static void main (String args[])
	{
	
		

		WebDriver driver = new ChromeDriver(); 
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.name("coffee"));
		
		Select s = new Select(w);
		 List<WebElement> q = s.getOptions();
		 
		 for(WebElement w1 : q)
		 {
			 System.out.println(w1.getText());
			 
			 
		 }
		 
		
		   
		 
		 
		 
		
	}

}
