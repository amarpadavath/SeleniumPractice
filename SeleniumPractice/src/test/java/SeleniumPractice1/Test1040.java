package SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1040 {
	public static void main(String args[])
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	//	
	//	WebElement s = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		
	//	driver.switchTo().frame(s);
		
		driver.switchTo().frame(0);
		
		driver.switchTo().defaultContent();
		
		
		}

}
