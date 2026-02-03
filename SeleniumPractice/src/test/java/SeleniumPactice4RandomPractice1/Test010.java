package SeleniumPactice4RandomPractice1;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Test010 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		

        // Navigate to the webpage with hover text
        driver.get("https://example.com/page-with-hover-text");
        
        driver.get("https://www.google.com");

        // Find the element that shows hover text (usually contains 'title' attribute)
        WebElement hoverElement = driver.findElement(By.id("hoverElementID"));

        // Retrieve the hover text from the 'title' attribute
        
        String hoverText = hoverElement.getAttribute("title");

        // Print the hover text
        System.out.println("Hover Text: " + hoverText);
        
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        
        js.executeScript("arguments[0].scrollIntoView(true);");
        
        js.executeScript("arguments[0].click();", hoverText);
        
        js.executeScript("arguments[0].value='Hellow';", hoverText);
        
        String title =(String) js.executeScript("return documenet.title;");
        
        js.executeScript("history.go(0);");
        
        String innertext = (String) js.executeScript("return documenet.documenetElement.innerText;");
        
        js.executeScript("window.scrollBy(0,500);");
        
        WebDriver driver1 = new ChromeDriver();
        
        driver.get("");
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File dest = new File("zxcvxcv.xlsx");
        
        FileHandler.copy(src, dest);
        
        driver.quit();
        
       String s =  hoverElement.getAttribute("value");
        
       hoverElement.getAttribute("href");
       hoverElement.getAttribute("src");
       hoverElement.getAttribute("class");
       hoverElement.getAttribute("id");
       hoverElement.getAttribute("placeholder");
       hoverElement.getAttribute("Type");
       
       hoverElement.getCssValue("color");
       hoverElement.getCssValue("background-color");
       hoverElement.getCssValue("font-size");
       hoverElement.getCssValue("border");
       hoverElement.getCssValue("font-weight");
       
       hoverElement.isDisplayed();
       hoverElement.isEnabled();
       hoverElement.isEnabled();
       
 //      List<WebElement> s1 = driver.findElemens(By.xpath("//"));   
       
       driver.manage().window().maximize();
       driver.manage().window().minimize();
       driver.manage().window().fullscreen();
      // driver.manage().window().setSize(null)
       driver.manage().window().setPosition(new Point(100,200));
       
       WebElement passwordField = driver.findElement(By.id("userLabel"));

       WebElement aboveElement = driver.findElement(By.id("example"));
      // WebElement found = driver.findElement(with(By.tagName("input")).above(aboveElement));
       
        
        
        
			
		
        

		

	}

	private static Object with(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}

}
