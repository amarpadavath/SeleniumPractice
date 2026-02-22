 package SeleniumPractice4RahulShetty;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test014RahulSHetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		WebElement test = driver.findElement(By.xpath("//*[@id='alertbtn']"));
		
		test.click();
		System.out.println("test");
		Alert alert = driver.switchTo().alert();
		System.out.println("test2");
		//alert.accept();
		
		System.out.println(alert.getText());
		System.out.println("test3");
		
		
		

	}

}
