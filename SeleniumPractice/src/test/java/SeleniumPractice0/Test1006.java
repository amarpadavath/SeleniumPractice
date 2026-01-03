package SeleniumPractice0;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1006 {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		Dimension d = new Dimension(500,500);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p = new Point(250,250);
		
		 driver.manage().window().setPosition(p); 
		  Thread.sleep(2000); 
		   
		  //To maximize the window 
		  driver.manage().window().maximize();
		
	}

}
