package SeleniumPractice3ImpornatntCommads;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test013Robot {
	
	public static void main(String args[]) throws AWTException
	{
		WebDriver driver = new ChromeDriver();
		
		Robot robot = new Robot();
		//Simulate Keyboard Input
		robot.keyPress(KeyEvent.VK_A); // Press 'A');
		robot.keyRelease(KeyEvent.VK_A);//release 'A'
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		//Simulate Mouse Movement and Click
		robot.mouseMove(500, 500);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//Automating File Upload
		
		String filePath = "C://PATH";
		
		for(char c : filePath.toCharArray())
		{
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			
			robot.keyPress(keyCode);
			
			robot.keyRelease(keyCode);
			
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		//
		
	}

}
