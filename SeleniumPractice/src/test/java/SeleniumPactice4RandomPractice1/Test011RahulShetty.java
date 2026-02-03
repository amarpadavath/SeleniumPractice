package SeleniumPactice4RandomPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test011RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("//label[contains(normalize-space(),'Radio1')]/child::input"));
		
		if (!s.isSelected()) {
		   s.click();
		}
		
		WebElement placeholder = driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
		
		placeholder.sendKeys("canada");
		
		WebElement canada = driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
		
		canada.click();

		WebElement drop = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select s1 = new Select(drop);
		
		//s1.
		
		s1.selectByIndex(1);
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		
		checkbox.click();
	//	s1.deselectByIndex(0);
		
		

	}

}
