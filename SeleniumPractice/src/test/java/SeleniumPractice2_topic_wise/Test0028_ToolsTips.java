package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0028_ToolsTips {
	
	public static void main(String args[])
	{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement s1 = driver.findElement(By.xpath("//*[@id='toolTipButton']"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", s1);
		

		// Find the element to hover over
		//WebElement elementToHover = driver.findElement(By.xpath("//your_xpath_here"));

		// Hover over it
		//Actions actions = new Actions(driver);
		//actions.moveToElement(s1).perform();
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(s1).perform();

		// Wait and find the tooltip
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hover me to see']")));

		String tooltipText = tooltip.getText();
		System.out.println("Tooltip text: " + tooltipText);
	}

}
