package SeleniumPractice0;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1001Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver;
			io.github.bonigarcia.wdm.WebDriverManager.chromedriver().clearDriverCache().setup();
			
			 driver = new ChromeDriver();
			
			String baseuri = "https://the-internet.herokuapp.com/basic_auth";
			driver.manage().window().maximize();
			driver.get(baseuri);
			
			Alert alert = driver.switchTo().alert();
			
			alert.sendKeys("yourUsername");

			// Click 'OK' to submit the alert
			alert.accept();
			alert.dismiss();

	}

}
