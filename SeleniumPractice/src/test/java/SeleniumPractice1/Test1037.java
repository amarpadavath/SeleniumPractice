package SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement s = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		
		s.click();
		
		WebElement t = driver.findElement(By.xpath("//input[@type='text' and  @class='r4vIwl BV+Dqf']"));
		
		t.sendKeys("9567406850");

	}

}
