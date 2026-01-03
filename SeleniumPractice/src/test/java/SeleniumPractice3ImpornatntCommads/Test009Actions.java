package SeleniumPractice3ImpornatntCommads;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test009Actions {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		WebElement s = driver.findElement(By.xpath(""));

		action.moveToElement(s).moveToElement(driver.findElement(By.xpath(""))).click().build().perform();

		action.moveToElement(s).click().perform();

		action.clickAndHold(s).perform();

		action.release().perform();
		action.contextClick(s).perform();
		action.doubleClick().perform();

		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(Source, Target).build().perform();

		WebDriver driver1 = new ChromeDriver();

		action.contextClick(s).perform();
		action.click().perform();
		action.click(s).perform();
		action.doubleClick(s).perform();
		action.contextClick().perform();
		action.contextClick(s).perform();
		action.moveToElement(s).perform();
	
		action.moveToElement(s, 50, 50).perform();
		action.moveByOffset(50,50);
		action.clickAndHold().perform();
		action.clickAndHold(s).perform();
		action.release().perform();
		action.release(s).perform();
		
		action.dragAndDrop(Source, Target);
		action.dragAndDropBy(s, 20, 20);
		action.sendKeys("xvcx").perform();
		action.sendKeys(s, "amar");
		action.keyDown(Keys.CONTROL);
		action.keyUp(Keys.CONTROL);
		action.click(s).moveToElement(s).build();
		action.perform();
		action.pause(Duration.ofSeconds(2));
		
		

	}

}
