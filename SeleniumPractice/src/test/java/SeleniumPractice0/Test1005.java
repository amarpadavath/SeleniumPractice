package SeleniumPractice0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1005 {
	
	public static void main(String args[])
	{
		//WebDriver  driver = new ChromeDriver()	;
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.navigate().to("https://www.google.com");
		
		driver1.manage().window().maximize();	
		
		String s = driver1.getCurrentUrl();
		
		System.out.println(" "+s);
		
		String q = driver1.getTitle();
		
		System.out.println(" "+q);
		
		String t= driver1.getWindowHandle();
		
		
		
		System.out.println(" "+t);
		
		driver1.quit();
		
		
		
		
		
		
		
		
				
	}

}
