package SeleniumPactice4RandomPractice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test012RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		// Store parent window
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Child window title: " + driver.getTitle());

		// Click something that opens a new window
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Switch to child window

		for (String window : allWindows) {
			if (!window.equals(parentWindow))

			{
				driver.switchTo().window(window);
			}
		}

		// Now you are in the child window
		System.out.println("Child window title: " + driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		System.out.println("Child window title: " + driver.getTitle());

		// Close child window
	//	driver.close();

	}

}
