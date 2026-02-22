package SeleniumPractice4RahulShetty;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		WebElement depPlaceHolder = driver.findElement(By.xpath("//input[@value='Departure City' and @id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		
		depPlaceHolder.click();
		
		depPlaceHolder.sendKeys("Ko");
		
		WebElement kochiButton = driver.findElement(By.xpath("//a[text()=' Kochi (COK)']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", kochiButton);
		
	//	js.executeScript("window.open(arguments[0].href,'_blank');", link);
		
		js.executeScript("window.open('https://www.google.com','_blank');");
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		
		//kochiButton.click();
		
		
		

	}

}
