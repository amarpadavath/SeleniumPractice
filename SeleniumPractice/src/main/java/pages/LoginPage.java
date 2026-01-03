package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ;
	
	By usernameField = By.id("username");
	By passwordField = By.id("password");
	By loginButton = By.xpath("//button[@class='radius']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
		}
	

}
