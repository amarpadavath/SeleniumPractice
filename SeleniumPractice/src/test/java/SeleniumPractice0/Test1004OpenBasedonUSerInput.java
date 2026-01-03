package SeleniumPractice0;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1004OpenBasedonUSerInput {
	
	

	public static void main(String args[])
	{
		 Scanner scn = new Scanner(System.in);
		 
		 String a = scn.next();
		 
		 WebDriver driver = null; 
		 if(a.equalsIgnoreCase("Chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 
		 else if (a.equals("Edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 
		 else
		 {
			 System.out.println("invalid input");
		 }
	}

}
