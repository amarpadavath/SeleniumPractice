package SeleniumPractice2_topic_wise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0005_WebTable2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("file:///F:/Study%20Material/Table.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.id("employeeTable"));
		
		List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
		
		for(WebElement row : rows)
		{
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			for(WebElement column : columns)
			{
				System.out.println(column.getText() + " ");
			}
			
			System.out.println();
			
			
		}
		
		WebElement specificRow = driver.findElement(By.xpath("//table[@id='employeeTable']//td[text()='John Doe']/following-sibling::td[1]"));
		
		System.out.println("John doe's position ......"+specificRow.getText());
		

		   

	

	}

}
