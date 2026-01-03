package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0030_Menu {
	
	
	public static void main(String args[])
	{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/menu");
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement menu = driver.findElement(By.xpath("//*[text()='Main Item 2']")); // or use By.xpath/cssSelector
		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Main Item 2']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform(); // hover action
		
		//WebElement menu1 = driver.findElement(By.xpath("//*[text()='SUB SUB LIST »']")); // or use By.xpath/cssSelector
		WebElement menu1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='SUB SUB LIST »']")));
		//Actions actions = new Actions(driver);
		actions.moveToElement(menu1).perform(); // hover action

		// Step 2: Click on the submenu item
		WebElement submenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Sub Sub Item 2']")));
		submenu.click();
		
		System.out.println("amar");
		
		System.out.println("amar");
		System.out.println("amar");
		
		
		
		
		
	}

}
