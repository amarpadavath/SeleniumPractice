package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0021_Accordion {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/accordian");
		
		driver.manage().window().maximize();
		
		WebElement s1 = driver.findElement(By.xpath("//*[text()='What is Lorem Ipsum?']"));
		
		s1.click();
		
		
	}

}
