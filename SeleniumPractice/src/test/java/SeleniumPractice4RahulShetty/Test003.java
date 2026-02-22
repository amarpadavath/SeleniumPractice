package SeleniumPractice4RahulShetty;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
	js.executeScript("window.open('https://www.google.com','_blank');");
	
	Set<String> w = driver.getWindowHandles();
	
	String parentW= driver.getWindowHandle();
		
	ArrayList<String> tabs = new ArrayList<>(w);
	
	for(String t : w)
	{
		if(!t.equals(parentW))
		{
			driver.switchTo().window(t);
		}
	}
	
	driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().window(tabs.get(0));

	}

}
