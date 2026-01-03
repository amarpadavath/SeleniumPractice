package SeleniumPractice3_topic_wise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0004Navigate {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&ec=futura_exp_og_so_72776762_e&hl=en&ifkv=AdBytiMxSL68R9iYd2-c1rynmj6J5HxysBox6W5hPthNezBcjkr20mZwxvqRtXzpCDIIolfEyLSE-Q&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1360960156%3A1756525703347658");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		
		
		
		
	}
	

}
