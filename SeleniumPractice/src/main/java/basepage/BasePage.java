package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	
	protected WebDriver driver;
	
	private WebDriverWait wait;
	
	
	public BasePage(WebDriver driver)
	{
		this.driver= driver;
		this.wait= new WebDriverWait(driver, 20);
	}
	
	public void click(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(BeClickable))
	}
	
	

}
/*protected WebDriver driver;
private WebDriverWait wait;
public BasePage(WebDriver driver) {
this.driver = driver;
this.wait = new WebDriverWait(driver, 20);
}
public void click(WebElement element) {
wait.until(ExpectedConditions.elementToBeClickable(element)).click();
}
public void enterText(WebElement element, String text) {
wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
}
public String getText(WebElement element) {
return wait.until(ExpectedConditions.visibilityOf(element)).getText();
}
}*/
