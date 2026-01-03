package SeleniumPractice2_topic_wise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0001_TextBox {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='fixedban']")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement element = 
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().perform();
		//System.out.print(true);
		
		WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']/parent::div"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", element);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", element);


		
		//driver.switchTo().frame(0);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='text' and text()='Text Box']")).click();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	// explicit wait - to wait for the compose button to be click-able
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		// click on the compose button as soon as the "compose" button is visible
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='text' and text()='Text Box']"))).click();
		
	//	WebElement s = driver.findElement(By.xpath("//input[@id='userName']"));
		
		//wait1.until(ExpectedConditions.elementToBeClickable(s));
		
		WebElement fullName= driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		
	//	wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fullName));
		
		fullName.sendKeys("Amar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		email.sendKeys("test@gmail.com");
		WebElement add = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		
		add.sendKeys("Amar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement curr= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		curr.sendKeys("amar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		
		submit.submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
