import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider");

        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));

        // Create Actions instance
        Actions move = new Actions(driver);

        // Move slider by offset (e.g., 50 pixels to the right)
        move.clickAndHold(slider).moveByOffset(50, 0).release().perform();

        // Optional: Get updated value
        String sliderValue = driver.findElement(By.id("sliderValue")).getAttribute("value");
        System.out.println("Slider moved to: " + sliderValue);

        driver.quit();
    }
}
