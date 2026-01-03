package SeleniumPractice3ImpornatntCommads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test002getAttribute {
	
	public static void main(String args[])
	{

		WebDriver driver = new ChromeDriver();

		// WebDriver driver3 = new EdgeDriver();

		driver.get("https://www.google.com");
		
		WebElement web = driver.findElement(By.xpath("//*[text()='Gmail' and @aria-label='Gmail ']"));
		//driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Amar");
		
		System.out.println(web.getAttribute("href"));
	}

}
