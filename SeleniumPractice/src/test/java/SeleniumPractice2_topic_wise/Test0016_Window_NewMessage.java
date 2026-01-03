package SeleniumPractice2_topic_wise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0016_Window_NewMessage {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/browser-windows");
	
	WebElement s1 = driver.findElement(By.xpath("//*[text()='New Window Message']"));
	
	//String mainWindow = driver.getWindowHandle();
	
	String mainWindow = driver.getWindowHandle();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", s1);
	
	Set<String> allwindow = driver.getWindowHandles();
	
	
	
	for(String window : allwindow)
	{
		if(!window.equals(mainWindow))
		{
			  driver.switchTo().window(window);
		        break;
		}
	}
	
	System.out.println("Title of new window: " + driver.getTitle());
	
	WebElement s2 = driver.findElement(By.xpath("//*[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']"));
	
	System.out.println(s2.getText());

}

}