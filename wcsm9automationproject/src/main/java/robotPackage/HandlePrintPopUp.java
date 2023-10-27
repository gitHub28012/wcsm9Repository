package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopUp {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("https://www.selenium.dev");
	    
	    //generate print pop up  ctrl + p
	    
	    Robot robot = new Robot();
	    
	    Thread.sleep(2000);
	    // press ctrl + p
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_P);
	    
	    Thread.sleep(2000);
	    //Release ctrl + p
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_P);
	    
	    Thread.sleep(2000);
	    //handle print pop up
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
	    Thread.sleep(2000);
	    //press enter key 
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(2000);
	    driver.quit();
	   
	}

}
