package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
		  WebElement w = driver.findElement(By.name("coffee")); 
		  
		  Select s = new Select(w);
		  s.selectByValue("black");
		  
		  s.selectByVisibleText("With sugar");
		  
		  List<WebElement> web = s.getAllSelectedOptions(); 
		  for(WebElement x:web){ 
		   System.out.println(x.getText()); 
		  }  
		 
		

	}

}
