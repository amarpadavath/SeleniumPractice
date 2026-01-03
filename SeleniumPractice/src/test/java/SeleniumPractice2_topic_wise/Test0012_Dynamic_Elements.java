package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0012_Dynamic_Elements {
	
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)) ;
		
		driver.get("https://demoqa.com/dynamic-properties");
		
	//	WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yourButtonId")));
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='enableAfter']")));
		//wait.until(ExpectedConditions.elementToBeClickable(button));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		System.out.println(button.getText());
		
		
		WebElement button1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='visibleAfter']")));
		//wait.until(ExpectedConditions.elementToBeClickable(button));
		wait.until(ExpectedConditions.elementToBeClickable(button1));
		
		System.out.println(button1.getText());
		
	}

}
