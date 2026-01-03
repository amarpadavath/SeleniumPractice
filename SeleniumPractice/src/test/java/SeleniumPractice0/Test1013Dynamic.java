package SeleniumPractice0;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1013Dynamic {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_content");
		
		//WebElement element = driver.findElement(By.xpath("(//div[@class='large-10 columns large-centered']//div[@class='large-10 columns'])[0]"));
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='large-10 columns large-centered']//div[@class='large-10 columns'])[1]"))));
		
		String s = element.getText();
		
		System.out.println("bbbh   "+s);

		}

}
