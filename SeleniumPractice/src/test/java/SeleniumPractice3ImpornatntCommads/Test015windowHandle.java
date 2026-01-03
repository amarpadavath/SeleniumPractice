package SeleniumPractice3ImpornatntCommads;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test015windowHandle {
	
	
	public static void main(String args[])

	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		Set<String> handles = driver.getWindowHandles();
		
		String parentWindow = driver.getWindowHandle();
		
		for(String handle : handles)
		{
			if(!handle.equals(parentWindow))
			{
				driver.switchTo().window(handle);
				break;
				
				// Switch back to parent
		       // driver.switchTo().window(parentWindow);
		        System.out.println("Back to parent tab: " + driver.getTitle());

		        driver.quit();
			}
		}
		
		
	}
}
