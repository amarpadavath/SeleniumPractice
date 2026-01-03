package SeleniumPractice3ImpornatntCommads;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test001 {

	public static void main(String args[]) {

		// System.setProperty("webdriver.gecko.driver", "//driver-location");

		// WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();

		// WebDriver driver3 = new EdgeDriver();

		driver.get("https://www.google.com");

		String url = driver.getCurrentUrl();

		System.out.println(url);

		String j = driver.getTitle();

		System.out.println(j);

		String j1 = driver.getPageSource();

		System.out.println(j1);

		boolean resull = driver.getPageSource().contains("String to find");

		System.out.println(resull);
		System.out.println(driver.getClass());

		driver.navigate().to("https://www.google.com");

		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();

		driver.findElement(By.xpath("//*[text()='Gmail' and @aria-label='Gmail ']")).click();

		driver.navigate().back();

		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Amar");

		driver.findElement(By.xpath("//*[@title='Search']")).clear();

		Object s = driver.findElement(By.xpath("//*[text()='Gmail' and @aria-label='Gmail ']")).getLocation();

		System.out.println(s);
		
		Object a = driver.findElement(By.xpath("//*[@title='Search']")).getLocation();
		
		System.out.println(a);
		
		Actions d = new Actions(driver);
		
		d.moveByOffset(764, 18).click();
		
		Dimension dimension = driver.findElement(By.xpath("//*[text()='Gmail' and @aria-label='Gmail ']")).getSize();
		
		System.out.println("Height of WebElement..."+dimension.height);
		
		System.out.println("width..."+dimension.width);
		
	}

}
