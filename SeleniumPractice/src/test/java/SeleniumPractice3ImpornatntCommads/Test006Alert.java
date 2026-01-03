package SeleniumPractice3ImpornatntCommads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test006Alert {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.switchTo().alert();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().sendKeys("amar");
		driver.switchTo().alert().getText();
		
	}

}
