package SeleniumPractice2_topic_wise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0007_Switchtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/links");
		
		WebElement s = driver.findElement(By.xpath("//*[text()='Home' and @id='simpleLink']"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", element);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",s);
		
		//s.click(); 
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> tabs = new ArrayList<>(handles);
		
		driver.switchTo().window(tabs.get(1));
		
		WebElement f = driver.findElement(By.xpath("//*[@href='https://demoqa.com']"));
		f.click();

	}

}
