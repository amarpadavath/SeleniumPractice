package SeleniumPractice0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		 
		 driver.get("http://www.adactin.com/HotelApp/index.php");
		 
		 driver.findElement(By.id("c")).sendKeys("vengat16");
		 
		 driver.findElement(By.id("password")).sendKeys("Karthick");
		 
		 String s = driver.findElement(By.id("username")).getAttribute("value");
		 
		 String s1 = driver.findElement(By.id("password")).getAttribute("value"); 
		 
		 System.out.println(s);
		 
		 System.out.println(s1);
		 

	}

}
