package SeleniumPractice3_topic_wise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0007WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/NotepadPrograms/Notes/2.Selenium/WebTable.html");
		
		// Get all rows
		List<WebElement> rows = driver.findElements(
		        By.xpath("//table//tr")
		);

		// Get second row (index 1 because index starts from 0)
		WebElement secondRow = rows.get(1);

		// Get all columns from second row
		List<WebElement> columns = secondRow.findElements(By.tagName("td"));

		// Get fourth column (index 3)
		String value = columns.get(4).getText();

		System.out.println(value);

	}

}
