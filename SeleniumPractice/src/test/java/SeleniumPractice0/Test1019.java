package SeleniumPractice0;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1019 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("https://demo.actitime.com/login.do"); 
		   
		  WebElement un = driver.findElement(By.id("FirstName")); 
		   
		  //To get the size of an element; height & width 
		  Dimension s = un.getSize(); 
		  int h = s.getHeight(); 
		  int w = s.getWidth(); 
		   
		  System.out.println("Height: "+h); 
		  System.out.println("Width: "+w); 
		   
		  //To get location of an element; x-axis & y-axis 
		  Point l = un.getLocation(); 
		  int x = l.getX(); 
		  int y = l.getY(); 
		   
		  System.out.println("x-axis: "+x); 
		  System.out.println("y-axis: "+y); 
		   
		  Thread.sleep(1000); 
		  driver.close();

	}

}
