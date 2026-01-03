package SeleniumPractice0;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1021 {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize(); 
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		Thread.sleep(2000); 
		
		// To get address of all the suggestions 
		String xp = "//span[contains(text(),'selenium')]"; 
		 List<WebElement> s = driver.findElements(By.xpath(xp));
		 
		 int count = s.size();
		 
		 for(int i=0; i<count;i++)
		 {
			WebElement s1 = s.get(i) ;
			
			String test = s1.getText();
			
			System.out.println(test);
		 }
		 
		 s.get(count - 1).click();
		
          
		}
		
		
	
	}


