package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0019_Frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/nestedframes");

		driver.switchTo().frame("frame1");
		
driver.get("https://demoqa.com/nestedframes");
        
        // Switch to the outer frame first
        driver.switchTo().frame("frame1");
        
        // Now inside the outer frame, find the inner frame
        WebElement innerFrame = driver.findElement(By.tagName("iframe"));
        
        // Switch to the inner frame
        driver.switchTo().frame(innerFrame);
        
        // Now inside the inner frame, fetch text
        WebElement innerText = driver.findElement(By.tagName("p"));
        System.out.println("Text inside inner frame: " + innerText.getText());
        
        // Switch back to parent frame (outer frame)
        driver.switchTo().parentFrame();
        
        // Optionally, get text from the outer frame (if needed)
        WebElement outerText = driver.findElement(By.tagName("body"));
        System.out.println("Text inside outer frame: " + outerText.getText());
        
        // Switch back to the main page
        driver.switchTo().defaultContent();
        
        driver.quit();


	}

}
