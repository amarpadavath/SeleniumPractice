package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ironspider.ca/tables/index.htm");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@cellpadding=5]//td"));
		
		for(WebElement o : list )
		{
			System.out.println(o.getText());
		}

	}

}
