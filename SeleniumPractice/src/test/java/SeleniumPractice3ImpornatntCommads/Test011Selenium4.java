package SeleniumPractice3ImpornatntCommads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test011Selenium4 {
	
	public static void main(String args[])
	{
		WebElement ele1;
		WebDriver driver = new ChromeDriver();
		ele1 = driver.findElement(By.id("123"));
		driver.findElement(withTagName("ABC").above(ele1)).getText();
		
		WebElement ele1;
		ele1 = driver.findElement(By.id("123"));
		String ele2 = driver.findElement(withTagName("AYZ").below(ele1)).getText();
		
		driver.findElement( withTagName("ABC").toLeftOf(ele1)).getText();
		
		driver.findElement( withTagName("ABC"). toRightOf (ele1)).getText();
		
		
		driver.findElement( withTagName("ABC"). near(ele1)).getText();
	}

}
