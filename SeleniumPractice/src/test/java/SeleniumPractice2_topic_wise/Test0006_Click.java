package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0006_Click {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
	//	WebElement  s = driver.findElement(By.xpath("//*[@type='button' and text()='Click Me']"));
		
	//	s.click();
		
		WebElement element = driver.findElement(By.xpath("//*[@type='button' and text()='Click Me']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
		//Actions actions = new Actions(driver);
		//WebElement element = driver.findElement(By.id("example"));
		//actions.contextClick(element).perform();
		
		Actions actions = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//*[@id='rightClickBtn' and text()='Right Click Me']"));
		
		actions.contextClick(element1).perform();
	//	Actions actions = new Actions(driver);
		//WebElement element = driver.findElement(By.id("example"));
		//actions.doubleClick(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id='doubleClickBtn' and text()='Double Click Me']"));
		actions.doubleClick(element2).perform();

		
		}

}
