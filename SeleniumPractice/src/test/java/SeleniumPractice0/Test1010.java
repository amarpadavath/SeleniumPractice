package SeleniumPractice0;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1010 {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fb_logo _8ilh img']")));
WebDriverWait wat = new WebDriverWait(driver, Duration.ofSeconds(10));

   WebElement element = wait.until(ExpectedConditions.ele)
		
		boolean s = driver.findElement(By.xpath("/*[@class='fb_logo _8ilh img']")).isDisplayed();
		
		if(s==true)
		{
			System.out.println("log  is available");
		}
		
		else
		{
			System.out.println("log is not available");
		}
		
		driver.quit();
				
	}

}
