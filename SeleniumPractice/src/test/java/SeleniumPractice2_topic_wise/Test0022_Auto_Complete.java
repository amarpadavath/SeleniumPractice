package SeleniumPractice2_topic_wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0022_Auto_Complete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/auto-complete");
		
		driver.manage().window().maximize();
		
		WebElement  s1 = driver.findElement(By.xpath("(//*[@class='auto-complete__placeholder css-1wa3eu0-placeholder'])[1]"));
		s1.click();
		s1.sendKeys("red");
		
		WebElement s2 = driver.findElement(By.xpath("//*[text()='Red']"));
		
		s2.click();
		
	//	WebElement  s1 = driver.findElement(By.xpath("//*[@id='autoCompleteMultiple']//*[@class='auto-complete__placeholder css-1wa3eu0-placeholder']"));

		s1.sendKeys("green");
		
		WebElement s3 = driver.findElement(By.xpath("//*[text()='Green']"));
		
		s3.click();
		
		WebElement  s4 = driver.findElement(By.xpath("(//*[@class='auto-complete__placeholder css-1wa3eu0-placeholder'])[2]"));
		s1.click();
		s1.sendKeys("red");
		
		WebElement s5 = driver.findElement(By.xpath("//*[text()='Red']"));

		s2.click();
		
		

	}

}
