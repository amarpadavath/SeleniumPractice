package SeleniumPractice2_topic_wise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0024_Date_Time_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        // Navigate to the page
	        driver.get("https://demoqa.com/date-picker");
	        
	        // Locate the date input box and click it to open the calendar
	        WebElement dateInput = driver.findElement(By.id("datePickerMonthYearInput"));
	        dateInput.click();

	        // Select month - May
	        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
	       // monthDropdown.sendKeys("May");
	        
	        // Create a Select object
	        Select dropdown = new Select(monthDropdown);

	        // Select by visible text
	        dropdown.selectByVisibleText("April");

	        // Or by value
	        // dropdown.selectByValue("option1");

	        // Or by index (starting from 0)
	        // dropdown.selectByIndex(1);

	        // Select year - 2025
	        WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
	       // yearDropdown.sendKeys("2025");
	        
	        Select dropdown1 = new Select(yearDropdown);

	        // Select by visible text
	        dropdown1.selectByVisibleText("2024");


	        // Select day - 20
	        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='20' and not(contains(@class, 'outside-month'))]"));
	        day.click();
	        
	        WebElement time = driver.findElement(By.xpath("//*[text()='07:30']"));
	        day.click();
	        
	        // Optional: Verify selected date
	        String selectedDate = dateInput.getAttribute("value");
	        System.out.println("Selected Date: " + selectedDate);

	        driver.quit();
	        
	        System.out.println("amafr");
	    
	        
	        



	}

}
