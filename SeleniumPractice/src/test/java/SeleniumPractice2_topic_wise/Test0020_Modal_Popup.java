package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0020_Modal_Popup {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/modal-dialogs");

		WebElement s = driver.findElement(By.xpath("//*[@id='showSmallModal']"));

		s.click();
		
		WebElement s2 = driver.findElement(By.xpath("//*[text()='This is a small modal. It has very less content']"));

		System.out.println(s2.getText());

		WebElement s1 = driver.findElement(By.xpath("//*[@id='closeSmallModal']"));

		s1.click();

	}

}
