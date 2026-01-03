package SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1032 {
	
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ironspider.ca/tables/index.htm");
		
		WebElement test = driver.findElement(By.xpath("//td[text()='Cascading Style Sheets']"));
		
		System.out.println(test.getText());
	}

}
