package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0018_Frame {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");

		driver.switchTo().frame("frame1");

		WebElement s1 = driver.findElement(By.xpath("(//*[text()='This is a sample page'])"));

		System.out.print(s1.getText());
		
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");

		WebElement s2 = driver.findElement(By.xpath("(//*[text()='This is a sample page'])"));

		System.out.println(s2.getText());
	}

}
