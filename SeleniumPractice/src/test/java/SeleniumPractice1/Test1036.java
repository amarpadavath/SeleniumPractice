package SeleniumPractice1;

import java.time.Duration;
import java.util.List;

import org.junit.internal.ExactComparisonCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("file:///C:/Users/USER/Downloads/FSDF.html");
		

		//	List<WebElement> list = driver.findElements(By.xpath("//div[@class='Mammal']//ancestor::div[@class='Animal']"));
			
		//	for(WebElement o : list )
			//{
			//	System.out.println(o.getText());
			//}
		WebElement s =	driver.findElement(By.xpath("//div[@class='Mammal']//ancestor::div[@class='Animal']"));
			System.out.println(s.getText());
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement web = wait.until(ExpectedConditions.visibilityOf(s)).click();

	}

}
