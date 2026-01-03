package SeleniumPractice2_topic_wise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0014_Window_Tab {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");

		WebElement s1 = driver.findElement(By.xpath("//*[@id='tabButton']"));

		// String mainWindow = driver.getWindowHandle();

		String originalTab = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", s1);

		Set<String> allTabs = driver.getWindowHandles();

		// Step 4: Switch to the new tab
		for (String tab : allTabs) {
		    if (!tab.equals(originalTab)) {
		        driver.switchTo().window(tab);
		        break;
		    }
		}

		System.out.println("Title of new window: " + driver.getTitle());

		WebElement s2 = driver.findElement(By.xpath("//*[@id='sampleHeading']"));

		System.out.println(s2.getText());

		// Step 6: Close the new window if needed
		//driver.close();

		// Step 7: Switch back to the main window
		driver.switchTo().window(originalTab);

		System.out.println("Title of new window: " + driver.getTitle());

	}

}
