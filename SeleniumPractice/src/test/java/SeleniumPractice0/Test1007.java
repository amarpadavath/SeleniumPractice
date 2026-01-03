package SeleniumPractice0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Test1007 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", ".exe")
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		

	}

}
