package SeleniumPractice3ImpornatntCommads;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test005WindowCommand {
	
	public static void main(String args[])
	{
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com','_blank');");
		
		String currentWindow = driver.getWindowHandles().toArray()[1].toString();
		
		driver.switchTo().window(currentWindow);
		
		String s = driver.getWindowHandle();
		
		System.out.println(s);
		
		Set<String> s1 = driver.getWindowHandles();
		
		for(String h : s1)
		{
			System.out.println(h);
		}
		
		int count = driver.getWindowHandles().size();
		
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
