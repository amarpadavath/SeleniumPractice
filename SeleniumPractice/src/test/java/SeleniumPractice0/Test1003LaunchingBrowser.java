package SeleniumPractice0;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1003LaunchingBrowser {
	
	public static void main(String args[]) throws IOException
	{
		 WebDriver driver = new EdgeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 URL url = new URL("https://www.facebook.com");
		 
		 driver.manage().window().maximize();
		 
		 HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		 connection.setConnectTimeout(10000);  // 10 seconds
		 connection.setReadTimeout(10000);     // 10 seconds

		 
		 driver.close();
	}

}
