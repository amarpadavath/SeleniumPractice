package SeleniumPractice3ImpornatntCommads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test003Dropdown {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement s = driver.findElement(By.xpath(""));
		s.submit();
		
		System.out.println(s.isDisplayed());
		System.out.println(s.isEnabled());
		System.out.println(s.isSelected());
		
		System.out.println(s.getTagName());
		
		System.out.println(s.getText());
		
		Select q = new Select(driver.findElement(By.xpath("")));
		
		q.deselectAll();
		q.deselectByIndex(0);
		q.deselectByValue("amae");
		q.deselectByVisibleText("text");
		q.selectByIndex(0);
		q.selectByVisibleText("");
		q.getAllSelectedOptions();
		q.getFirstSelectedOption();
		q.getOptions();
		boolean b = q.isMultiple();
		
		
		
		
		
	}

}
