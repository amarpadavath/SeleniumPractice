package SeleniumPractice4RahulShetty;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test004 {
	
	public static void main(String args[])
	{
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("a")));

		//List<WebElement> test = driver.findElements(By.tagName("a"));

		List<WebElement> test = driver.findElements(By.tagName("a"));
		try
		{
		for(WebElement d : test)
		{
			
			if(d.getAttribute("href").contains("mail/&ogbl"))
			{
			System.out.println(d.getAttribute("href"));
			
			((JavascriptExecutor) driver)
	        .executeScript("window.open(arguments[0].href,'_blank');", d);
			//d.click();
			}
		
			 
		}
		
		}
		catch(StaleElementReferenceException e) {
	        System.out.println("Element became stale. Re-locating...");
	    }
	}
		
	}


