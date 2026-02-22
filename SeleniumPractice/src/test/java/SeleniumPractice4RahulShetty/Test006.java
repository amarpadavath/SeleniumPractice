package SeleniumPractice4RahulShetty;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test006 {

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
		
		WebElement destButton = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		
		destButton.sendKeys("Delhi (DEL)");
		
		WebElement deliBtn = driver.findElement(By.xpath("//li[@class='livecl']/a[text()=' Delhi (DEL)' and @text='Delhi (DEL)' and @value='DEL']"));
		
		deliBtn.click();
		
		WebElement datePic = driver.findElement(By.xpath("//td[@data-month=4]/child::a[@class='ui-state-default' and text()='6']"));
		
		datePic.click();
		
		WebElement date2PIc = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Todate']/following-sibling::button[@type='button' and @class='ui-datepicker-trigger']"));
		date2PIc.click();
		WebElement datePic2 = driver.findElement(By.xpath("//td[@data-month=5]/child::a[@class='ui-state-default' and text()='11']"));
		
		datePic2.click();
		
		WebElement passBtn = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		
		passBtn.click();
		
		WebElement addBtn = driver.findElement(By.xpath("//span[@id='spanAudlt']/following-sibling::*"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click;",addBtn);
		js.executeScript("arguments[0].click;",addBtn);
		
		addBtn.click();
		//addBtn.click();
		
		
		
		
		
		
		
	

		
		
		
		

	}

}
