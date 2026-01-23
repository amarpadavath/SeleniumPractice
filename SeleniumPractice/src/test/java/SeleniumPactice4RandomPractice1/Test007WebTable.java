package SeleniumPactice4RandomPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test007WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/NotepadPrograms/Notes/2.Selenium/WebTable.html");
		
		List<WebElement> allrow = driver.findElements(By.xpath("//thead/tr/th"));
		
		for(WebElement s : allrow)
		{
			
			if(s.getText().equals("Name"))
			{
			
			System.out.println(s.getText());
			
			}
			
			
		}
		

	}

}
