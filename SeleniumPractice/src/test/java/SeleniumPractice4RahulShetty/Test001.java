package SeleniumPractice4RahulShetty;


import java.time.Duration;

import org.junit.Assert;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='search']"));
		
		searchBtn.sendKeys("Brocolli");
		
		WebElement plusBtn = driver.findElement(By.xpath("//input[@type='number']/following-sibling::*"));
		
		plusBtn.click();
		plusBtn.click();
		
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='product-action']/child::*"));
		
		addToCart.click();
		
		WebElement checkCart = driver.findElement(By.xpath("//a[@class='cart-icon']/child::img[@alt='Cart']"));
		
		checkCart.click();
		
		WebElement brocoli = driver.findElement(By.xpath("(//li//p[text()='Brocolli - 1 Kg'])[1]"));
		
		  SoftAssert softAssert = new SoftAssert();
	

		  softAssert.assertEquals(
		        brocoli.getText(),
		        "Brocolli - 1 Kg",
		        "Broccoli text mismatch"
		);
		
		WebElement proceedBtn = driver.findElement(By.xpath("//*[@type='button' and text()='PROCEED TO CHECKOUT']"));
		
		proceedBtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement placeHolderBtn = driver.findElement(By.xpath("//button[text()='Place Order']"));
		
		placeHolderBtn.click();
		
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropDown);
		
		select.selectByValue("India");
		
		WebElement checkBox= driver.findElement(By.xpath("//input[contains(text(),agree)]"));
		
		checkBox.click();
		
		WebElement proceedBtn2 = driver.findElement(By.xpath("//button"));
		
		proceedBtn2.click();
		
		

		
		  
		
		
		

	}

}
