package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0017_Alert {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		WebElement s1 = driver.findElement(By.xpath("//*[@id='alertButton']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s1);

		// Alert alert = driver.switchTo().alert();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		WebElement s2 = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s2);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Alert alert1 = driver.switchTo().alert();
		
		alert.accept();
		
		WebElement s3 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		
		alert.dismiss();
		
		WebElement s4 = driver.findElement(By.xpath("//*[@id='promtButton']"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s4);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		alert.sendKeys("Amar");
		
		alert.accept();
		
		System.out.println("amar");
	}

}
