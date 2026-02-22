package SeleniumPractice4RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test016RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		
		String s = "Selenium Webdriver with Java Basics + Advanced + Interview Guide";
		
		WebElement w = driver.findElement(By.xpath("//tr/td[text()='"+s+"']/following-sibling::*"));
		
		System.out.println(w.getText());
		//driver.get
		
		List<WebElement> value = driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr/td[3]"));
		
		for(WebElement q : value)
		{
			System.out.println(q.getText());
		}

	}

}
