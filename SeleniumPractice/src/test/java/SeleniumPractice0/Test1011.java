package SeleniumPractice0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1011 {
	
	public static void main(String arg[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		 boolean logo = driver.findElement(By.xpath("//*[@id='email']")).isEnabled();
		 
		 if(logo==true)
		 {
			 System.out.println("text box is enable to print");
		 }
		 else
		 {
			 System.out.println("not enavle");
		 }
	}

}
