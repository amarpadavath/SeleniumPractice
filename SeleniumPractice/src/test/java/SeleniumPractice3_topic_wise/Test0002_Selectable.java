package SeleniumPractice3_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0002_Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable");

		driver.manage().window().maximize();

		WebElement s = driver.findElement(By.xpath("(//*[text()='Grid'])"));

		s.click();

		WebElement s1 = driver.findElement(By.xpath("(//*[text()='One'])"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s1);

	}

}
