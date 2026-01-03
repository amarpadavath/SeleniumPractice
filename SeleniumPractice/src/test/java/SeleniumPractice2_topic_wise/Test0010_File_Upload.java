package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0010_File_Upload {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/upload-download");

		WebElement s = driver.findElement(By.xpath("//*[@id='uploadFile']"));
		
		String filePath = "C:/Users/USER/Downloads/sampleFile.jpeg";

		s.sendKeys(filePath);

		//WebElement submitButton = driver.findElement(By.id("submit-button"));
		//submitButton.click();

		// Close the driver
		//driver.quit();
	}

}
