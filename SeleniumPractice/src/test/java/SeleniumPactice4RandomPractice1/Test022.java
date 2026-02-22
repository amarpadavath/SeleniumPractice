package SeleniumPactice4RandomPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/NotepadPrograms/Notes/2.Selenium/Xpath%20axes.html");
		
		WebElement s = driver.findElement(By.xpath("//*[@id='amar2']"));
		
	
		System.out.println(s.getAttribute("type"));
		System.out.println(s.getCssValue("background-color"));
		

	}

}
