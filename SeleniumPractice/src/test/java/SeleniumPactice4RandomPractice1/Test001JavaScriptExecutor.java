package SeleniumPactice4RandomPractice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500);");
		
		WebElement elements= driver.findElement(By.xpath(""));
		
		js.executeScript("arguments[0].scrollIntoView(true);", elements);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("i ama amar");
		
		alert.dismiss();
		
		driver.switchTo().frame(0);
		
		
		
		

	}

}
