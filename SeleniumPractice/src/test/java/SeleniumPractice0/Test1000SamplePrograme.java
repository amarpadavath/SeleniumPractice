package SeleniumPractice0;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Test1000SamplePrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().clearDriverCache().setup();
		
		 driver = new ChromeDriver();
		 
		// driver = new GeckoDriverInfo();
		 
		 driver = new FirefoxDriver();
		 
	//	 driver = new EdgeDriver()
				 
		//		 driver.
		
		String baseuri = "https://the-internet.herokuapp.com/add_remove_elements/";
		driver.manage().window().maximize();
		driver.get(baseuri);
		
		WebElement  s = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
		
		s.click();
		
		s.click();
		
		WebElement  r = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
		
		Assert.assertTrue(r.isDisplayed());
		
		driver.quit();

	}

}
