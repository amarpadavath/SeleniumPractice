package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1029 {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		
		WebElement w = driver.findElement(By.name("coffee"));
		
		Select s = new Select(w);
		
		List<WebElement> web = s.getOptions();
		
		for(int i=0;i<web.size();i++)
		{
			
			s.selectByIndex(i);
			Thread.sleep(3000);
			if(s.isMultiple()==true)
				
			{
			
			
			s.deselectByIndex(i);
			}
			else
			{
				System.out.println("We can not deselects");
			}
		}
		
	}

}
