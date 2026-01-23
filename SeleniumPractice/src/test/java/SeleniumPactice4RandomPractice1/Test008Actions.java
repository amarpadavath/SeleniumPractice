package SeleniumPactice4RandomPractice1;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test008Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		 Actions action = new Actions(driver);
		 
		 action.click().perform();
		 WebElement s = driver.findElement(By.xpath(null));
		 action.doubleClick();
		 action.contextClick();
		 action.moveToElement(s);
		 action.moveToElement(s, 0, 0);
		 action.moveByOffset(0, 0);
		 action.click();
		 action.clickAndHold();
		 action.clickAndHold(s);
		 action.release();
		 action.sendKeys(args);
		 action.dragAndDrop(s,s);
	//	 action.dragAndDropBy(s, 0, 0);
		// action.keyDown(Keys )

		// driver.navigate().to(null);
		 driver.navigate().forward();
		 driver.navigate().back();
		 driver.navigate().refresh();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 
		
		 
		 List<WebElement> d = driver.findElements(By.xpath(""));
		 
		 for(WebElement s1 : d)
		 {
			 s1.getText();
		 }
				 
	}

}
