package SeleniumPractice4RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test015RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		WebElement test = driver.findElement(By.xpath("//*[@id='hide-textbox']"));
		
		test.click();
		
		WebElement hide = driver.findElement(By.xpath("//*[@placeholder='Hide/Show Example']"));
		
		System.out.println(hide.isDisplayed());
		System.out.println(hide.isEnabled());
		System.out.println(hide.isSelected());
		
		

	}

}
