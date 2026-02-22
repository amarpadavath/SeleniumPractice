package SeleniumPractice4RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		Select s = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
		s.selectByValue("AED");

	}

}
