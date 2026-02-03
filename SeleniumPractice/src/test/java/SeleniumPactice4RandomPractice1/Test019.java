package SeleniumPactice4RandomPractice1;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com");

		// Get the main window handle
		String mainWindowHandle = driver.getWindowHandle();

		// Open a new window (simulating a new tab or pop-up)
		((JavascriptExecutor) driver).executeScript("window.open('https://google.com', '_blank');");

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String handle : windowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		        System.out.println("Switched to new window: " + handle);
		        System.out.println(driver.getCurrentUrl());
		        System.out.println(driver.getTitle());
		        break;
		    }
		}
		
		driver.switchTo().window(mainWindowHandle);
		
		driver.navigate().back();

	}

}
