package SeleniumPractice0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1015 {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.adactin.com/HotelApp/"); 
		driver.findElement(By.id("username")).sendKeys("test"); 
		driver.findElement(By.id("password")).sendKeys("123456"); 
		driver.findElement(By.id("login")).click(); 
		boolean b = driver 
		.findElement( 
		By.xpath("//*[@id='login_form']/table/tbody/tr[5]/td[2]/div/b")) 
		.isDisplayed(); 
		if (b = true) { 
		System.out.println("invalid msg shown"); 
		} else { 
		System.out.println("not");
	}
	}

}
