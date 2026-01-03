package SeleniumPractice0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1014 {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/index.php");
		
		driver.findElement(By.id("username")).sendKeys("vengat16"); 
		driver.findElement(By.id("password")).sendKeys("Karthick"); 
		String s = driver.getCurrentUrl();
		
		String s2 = driver.findElement(By.id("username")).getAttribute("value"); 
		String s1 = driver.findElement(By.id("password")).getAttribute("value"); 
		System.out.println(s2); 
		System.out.println(s1);
		
		System.out.println(s);
		
		if(s.equals("http://www.adactin.com/HotelApp/index.php"))
		{
			System.out.println("in the website");
		}
		else
		{
			System.out.println("not the website");
		}
		
	}

}
