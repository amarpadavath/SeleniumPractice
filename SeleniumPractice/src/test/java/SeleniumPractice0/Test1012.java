package SeleniumPractice0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1012 {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")) 
		.click(); 
 boolean logo = driver.findElement(By.xpath("//*[@id='email']")).isSelected();
		 
		 if(logo==true)
		 {
			 System.out.println("selected");
		 }
		 else
		 {
			 System.out.println("not selected");
		 }
	
	}

}
