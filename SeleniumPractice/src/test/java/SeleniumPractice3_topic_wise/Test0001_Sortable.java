package SeleniumPractice3_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0001_Sortable {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/sortable");

		driver.manage().window().maximize();
		
		  WebElement source = driver.findElement(By.xpath("(//*[text()='Two'])[1]"));
		  
	        WebElement target = driver.findElement(By.xpath("(//*[text()='Three'])[1]'"));

	        // Perform drag and drop
	        Actions actions = new Actions(driver);
	        actions.clickAndHold(source)
	               .moveToElement(target)
	               .release()
	               .build()
	               .perform();

	      //  driver.quit();
	}

}
