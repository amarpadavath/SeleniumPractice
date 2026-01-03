package SeleniumPractice1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test1038 {
	
	public static void main(String arg[])
	{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement s = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("test")));
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(10, TimeUnit.SECONDS)
		    .pollingEvery(1, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			
			SoftAssert soft = new SoftAssert();
			
			 SoftAssertions softly = new SoftAssertions();
			 
			 assert
	
	
	
	}
	


}
