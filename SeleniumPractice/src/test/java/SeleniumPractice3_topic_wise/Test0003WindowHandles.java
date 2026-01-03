package SeleniumPractice3_topic_wise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0003WindowHandles {
	
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Open Tab']"))).click();
		
		String currentURL = driver.getWindowHandle();
		System.out.println(currentURL);
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String s : allWindow)
		{
			
			System.out.println(s);
			
			if(s.equals(currentURL))
			{
				driver.switchTo().window(s);
				
				System.out.println("moved to parent window hanles");
				
				break;
			}
			
		}
		
		
		
		
		
		
		
	}

}
