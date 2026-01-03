package SeleniumPractice1;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Set the browser window size using the Dimension class
        //Dimension dimension = new Dimension(1024, 768); // width=1024, height=768
       // driver.manage().window().setSize(dimension);
        
        driver.manage().window().maximize();
        
        Dimension dimension = new Dimension(1024,768);
        
        driver.manage().window().setSize(dimension);
        
       System.out.println( driver.manage().window().getPosition());

	}

}
