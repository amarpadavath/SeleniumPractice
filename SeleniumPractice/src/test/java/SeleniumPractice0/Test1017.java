package SeleniumPractice0;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1017 {
    public static void main(String[] args) {
        WebDriver driver = null;
        
        try {
            // Initialize WebDriver
            driver = new ChromeDriver();

            // Navigate to the dropdown page
            driver.get("http://ironspider.ca/forms/dropdowns.htm");

            // Find the dropdown element by its name attribute
            WebElement dropdown = driver.findElement(By.name("coffee"));

            // Create a Select object to interact with the dropdown
            Select select = new Select(dropdown);

            // Get all the available options from the dropdown
            List<WebElement> options = select.getOptions();

            // Loop through the options and print their value attribute and visible text
            for (WebElement option : options) {
                System.out.println("Value: " + option.getAttribute("value"));
                System.out.println("Text: " + option.getText());
            }
        } catch (Exception e) {
            // Catching any exceptions, including InvocationTargetException
            System.out.println("An error occurred: " + e.getClass().getName());
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the browser if initialized
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
