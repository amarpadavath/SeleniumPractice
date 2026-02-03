package SeleniumPactice4RandomPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test017RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",s);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(s).perform();
		
		WebElement s1 = driver.findElement(By.xpath("//a[text()='Top']"));
		
		s1.click();
		
		

	}

}
