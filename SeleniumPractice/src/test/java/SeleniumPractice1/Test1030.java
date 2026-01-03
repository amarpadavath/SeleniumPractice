package SeleniumPractice1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test1030 {
	
	public static void main(String arg[])
	{
	
	//WebDriverManager.chromedriver().setup();
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
      driver.get("https://www.flipkart.com/");
      
      WebElement element = driver.findElement(By.xpath("(//*[@class='_2puWtW _3a3qyb'])[1]"));
      
      element.click();
      
      String s = driver.getTitle();
      
      Assert.assertEquals(" messasge", "Flipkart Grocery Store - Groceries Online & Get Rs.1 Deals at Flipkart.com", s);
	}

	
	
}
