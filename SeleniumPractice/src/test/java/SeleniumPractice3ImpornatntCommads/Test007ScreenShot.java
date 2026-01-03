package SeleniumPractice3ImpornatntCommads;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.appender.FileManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test007ScreenShot {
	
	public static void main(String args[]) throws IOException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File("path"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com/");
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		
		WebDriver s = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr1, new File("c:\\temp\\screenshot.png"));
		
		System.out.println("tets")	;
		
		System.out.println("amar");
		
		
		
		
	}

}
