package SeleniumPractice4RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test018RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement s = driver.findElement(By.xpath("(//a[text()='Courses' and @href='https://courses.rahulshettyacademy.com/courses'])[1]"));
		
		System.out.println(s.getText());
		
		driver.switchTo().defaultContent();
		
	WebElement test = driver.findElement(By.xpath("//*[@id='alertbtn']"));
		
		test.click();
		
		

	}

}
