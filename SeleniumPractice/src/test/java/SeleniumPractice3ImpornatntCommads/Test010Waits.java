package SeleniumPractice3ImpornatntCommads;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test010Waits {

	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		Alert s = wait.until(ExpectedConditions.alertIsPresent());

		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		usernameField.sendKeys("testUser");

		wait.until(ExpectedConditions.visibilityOf(usernameField));

		WebElement s1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

		s1.sendKeys("mar");

		Thread.sleep(50000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(null));
		
	//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("element_class")));
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(null)));
		//wait.until(ExpectedConditions.visibilityOfAllElements(listOfElements));
		
		List<WebElement> s5= driver.findElements(By.xpath(null));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(s5));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("element_class")));
		
		////Element State (Enabled, Selected, Clickable)
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("element_id")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id(null)));
		
		wait.until(ExpectedConditions.elementToBeClickable(s1));
		
		//wait.until(ExpectedConditions.elementToBeSelected(By.id("checkbox_id")));
		
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath(null)));
		
		wait.until(ExpectedConditions.elementToBeSelected(s1));
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.id("checkbox_id"), true));
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(s1, true));
		
		//Text-Related Conditions
		
		wait.until(ExpectedConditions.textToBePresentInElement(s1, "expected text"));
		
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("element_id"), "Expected Text"));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(null), "Expectes text"));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_id"), "Expected Value"));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_id"), "Expected Value"));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_id"), "Expected Value"));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_id"), "Expected Value"));
		wait.until(ExpectedConditions.textToBePresentInElementValue(s1, "Expected Value"));
		
		 //Alert Conditions
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.invisibilityOf(s1));
		//Invisibility and Staleness
		
		wait.until(ExpectedConditions.invisibilityOf(s1));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("element_id")));
		wait.until(ExpectedConditions.stalenessOf(s1));
		wait.until(ExpectedConditions.stalenessOf(s1));
		//Frame and Window Conditions
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("frame_name")));
		
	//	Wait wait = new FluentWait(driver);
	//	withTimeout(30, SECONDS);
	//	pollingEvery(5, SECONDS);
	//	ignoring(NoSuchElementException.class);
		
	FluentWait<WebDriver> wa = new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(0))
			.ignoring(NoSuchElementException.class);
		
		
		





		 






		
		
,


	}

}
