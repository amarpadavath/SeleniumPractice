package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginSteps {
	
	WebDriver driver;
	
	LoginPage loginPage;
	




	    @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        // Code to navigate to the login page
	    	io.github.bonigarcia.wdm.WebDriverManager.chromedriver().clearDriverCache().setup();
	    	
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	    	driver.get("https://www.google.com");
	    	loginPage = new LoginPage(driver);
	    }

	    @When("I enter valid credentials")
	    public void i_enter_valid_credentials() {
	        // Code to enter valid credentials (username and password)
	    	loginPage.enterUserName("amar");
	    	loginPage.enterPassword("testpass");
	    	loginPage.clickLoginButton();
	    }

	    @Then("I should be redirected to the home page")
	    public void i_should_be_redirected_to_the_home_page() {
	        // Code to verify the user is redirected to the home page
	    	
	    	String expectedUrl="fvfvf";
	    	String actualUrl= driver.getCurrentUrl();
	    	assert actualUrl.equals(expectedUrl);
	    	
	    	driver.quit();
	    }
	}



