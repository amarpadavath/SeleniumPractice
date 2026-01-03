package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0003_RadioButton {

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

		WebElement element1 = driver.findElement(By.xpath("//*[@class='text' and text()='Radio Button']"));
		element1.click();

		//WebElement s = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		WebElement s = driver.findElement(By.xpath("//*[@for='yesRadio']"));

		s.click();
		
		boolean w = s.isSelected();
		
		System.out.println(w);
		
		if (s.isSelected()) {
			System.out.println("Radio button is  selected");
		} else {
			System.out.println("radio button is not slected");
		}

	}

}
