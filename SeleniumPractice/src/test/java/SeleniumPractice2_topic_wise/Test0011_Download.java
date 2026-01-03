package SeleniumPractice2_topic_wise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0011_Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/upload-download");
		
		WebElement s = driver.findElement(By.xpath("//*[@id='downloadButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s);
		
		File file = new File("C:/Users/USER/Downloads/sampleFile.jpeg");
		if (file.exists()) {
		    System.out.println("✅ File downloaded successfully.");
		} else {
		    System.out.println("❌ File download failed.");
		}
		


	}

}
