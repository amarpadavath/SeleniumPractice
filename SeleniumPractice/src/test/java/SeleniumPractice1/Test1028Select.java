package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1028Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			
			 driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
			  WebElement w = driver.findElement(By.name("coffee")); 
			  
			  Select s = new Select(w);
			System.out.println(s.isMultiple());
			
			List<WebElement> web = s.getOptions(); 
			s.selectByValue("black"); 
			s.selectByValue("cream");
			  
			 
			  
			 
	}

}
