package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0004_WebTable {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']/parent::div"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//

		WebElement element1 = driver.findElement(By.xpath("//*[@class='text' and text()='Web Tables']"));
		element1.click();

		WebElement s = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));

		s.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement s1 = driver.findElement(By.xpath("//*[@placeholder='First Name']"));

		s1.sendKeys("Amar");

		WebElement s2 = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));

		s2.sendKeys("PV");

		WebElement s3 = driver.findElement(By.xpath("//*[@placeholder='name@example.com']"));

		s3.sendKeys("test@gmail.com");

		WebElement s4 = driver.findElement(By.xpath("//*[@placeholder='Age']"));

		s4.sendKeys("10");

		WebElement s5 = driver.findElement(By.xpath("//*[@placeholder='Salary']"));

		s5.sendKeys("100");

		WebElement s6 = driver.findElement(By.xpath("//*[@placeholder='Department']"));

		s6.sendKeys("test");

		WebElement s7 = driver.findElement(By.xpath("//*[@id='submit']"));

		s7.click();

	}

}
