package SeleniumPractice2_topic_wise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0013_Practice_Form {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://demoqa.com/automation-practice-form");

		WebElement s = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		s.sendKeys("amar");

		WebElement s1 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

		s1.sendKeys("amar");

		WebElement s2 = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));

		s2.sendKeys("testgmail.com");

		WebElement s3 = driver.findElement(By.xpath("//*[@for='gender-radio-1' and text()='Male']"));

		// s3.click();

		if (!s3.isSelected()) {
			// Use JavaScriptExecutor to click
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", s3);
		}

		// Verify it's selected
		System.out.println("Male selected: " + s3.isSelected());

		WebElement s4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));

		// s2.sendKeys("225");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='222555';", s4);

		WebElement s5 = driver.findElement(By.id("dateOfBirthInput"));

		js.executeScript("arguments[0].click();", s5);

		WebElement s6 = driver
				.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--017']"));
		// JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", s6);

		WebElement s7 = driver.findElement(By.xpath("(//div[@id='subjectsWrapper']/div)[2]"));

		js.executeScript("arguments[0].value='221';", s7);

		WebElement s8 = driver.findElement(By.xpath("//label[text()='Sports']"));

		js.executeScript("arguments[0].click();", s8);

		WebElement s9 = driver.findElement(By.xpath("(//div[@id='subjectsWrapper']/div)[2]"));

		js.executeScript("arguments[0].value='\"C:\\Users\\USER\\Downloads\\sampleFile (2).jpeg\"';", s9);

		// while
		// (!driver.findElement(By.className("calendarHeader")).getText().contains("April
		// 2025")) {
		// driver.findElement(By.className("nextButton")).click();
		// }

		// List<WebElement> dates = driver.findElements(By.xpath("//td[@class='day' or
		// @class='datepicker-day']"));
		// for (WebElement date : dates) {
		// if (date.getText().equals("19")) {
		// date.click();
		// break;
		// }
		// }
		
		WebElement s10 = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));

		js.executeScript("//textarea[@placeholder='Current Address']", s10);
		
		System.out.println("amar");
	}

}
