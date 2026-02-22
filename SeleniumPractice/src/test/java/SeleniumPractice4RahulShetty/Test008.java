package SeleniumPractice4RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class Test008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String s = driver.getCurrentUrl();
		
		String exp = "https://rahulshettyacademy.com/dropdownsPractise/qvcvc/";
		
		SoftAssert softAssert = new SoftAssert();
		
		//softAssert.assertEquals(s, exp,"Title mismatch - Validation Failed");
		
		//try {
		//    softAssert.assertEquals(s, exp);
		//    System.out.println("Assertion Passed ✅");
		//} catch (AssertionError e) {
		//    System.out.println("Assertion Failed ❌");
		//}

		
	//softAssert.assertAll();
		
		

		try {
		    Assert.assertEquals(s, exp);
		    System.out.println("Assertion Passed ✅");
		} catch (AssertionError e) {
		    System.out.println("Assertion Failed ❌");
		    throw e;   // important to fail the test
		}
		
		try
		{
			Assert.assertEquals(s, exp);
			System.out.println("Assertion passed");
		}
		
		catch(AssertionError d)
		{
			 System.out.println("Assertion Failed ❌");
			    throw d;   // important to fail the test
			
		}


		

	}

}
