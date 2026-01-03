package SeleniumPractice2_topic_wise;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0002_CheckBox {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']/parent::div"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//

		WebElement element1 = driver.findElement(By.xpath("//*[@class='text' and text()='Check Box']"));
		element1.click();

		// WebElement checkbox = driver.findElement(By.id("checkboxId"));

		WebElement checkbox = driver.findElement(By.xpath("(//*[text()='Home']/ancestor-or-self::span)[2]"));
		// Check if it's already selected
		// if (!checkbox.isSelected()) {
		// checkbox.click(); // Select the checkbox if not selected
		// }
		boolean s = checkbox.isEnabled();
		boolean d = checkbox.isDisplayed();
		System.out.println(s);
		System.out.println(d);
		boolean isChecked = checkbox.isSelected();
		System.out.println(isChecked);

		if (!checkbox.isSelected()) {
			checkbox.click();
		}

		String exptected = "You have selected :";
		String actual = driver.findElement(By.xpath("//span[text()='You have selected :']")).getText();

		Assert.assertEquals(actual, exptected);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		System.out.println(isChecked);
		
		if(checkbox.isSelected())
		{
			checkbox.click();
		}
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//span[@class='rct-title']"));
		
		for(WebElement checkbox1 : checkboxes)
		{
			if(!checkbox1.isSelected())
			{
				checkbox1.click();
				boolean isChecked1 = checkbox1.isSelected();
				System.out.println(isChecked);
			}
		}
		
		// need to check on de selection. is enabled, is selected, is dispaplyed

	}

}
