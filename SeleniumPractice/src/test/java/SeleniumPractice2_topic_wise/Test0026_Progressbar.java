package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0026_Progressbar {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/progress-bar");
		
		WebElement s1 = driver.findElement(By.xpath("//*[@id='startStopButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s1);
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s1);


	}

}
