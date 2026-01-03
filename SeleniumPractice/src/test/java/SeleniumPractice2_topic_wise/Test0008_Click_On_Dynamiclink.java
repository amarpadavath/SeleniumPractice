package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0008_Click_On_Dynamiclink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/links");
		
		WebElement s = driver.findElement(By.xpath("//*[text()='Home' and @id='dynamicLink']"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", element);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",s);
		
		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].click();", s);

	}

}
