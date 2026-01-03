package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0029_Placeholder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement s1 = driver.findElement(By.xpath("//*[@placeholder='Hover me to see']"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", s1);
		

		// Find the element to hover over
		//WebElement elementToHover = driver.findElement(By.xpath("//your_xpath_here"));

		// Hover over it
		Actions actions = new Actions(driver);
		actions.moveToElement(s1).perform();
		
	//	Actions actions = new Actions(driver);
		
	//	actions.moveToElement(s1).perform();

		// Wait and find the tooltip
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='You hovered over text field']")));

		//String tooltipText = tooltip.getText();
		//System.out.println("Tooltip text: " + tooltipText);
		
		System.out.println(s1.getText());

	}

}
