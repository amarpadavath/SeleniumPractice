package SeleniumPractice3ImpornatntCommads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test008Frame {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("namwe");
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		//iframe
		//driver.switchTo().frame(driver.findElements(By.tagName(“iframe”).get(FRAME_INDEX));
		
		
	}

}
