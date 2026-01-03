package SeleniumPractice3_topic_wise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0005WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		List<WebElement> s = driver.findElements(By.xpath("//tbody/tr/td[5]"));
		
		for(WebElement b : s)
		{
			String name = b.getText();
			if(name.equalsIgnoreCase("Amar"))
			{
				b.findElement(By.xpath(name))
			}
		}

	}

}
