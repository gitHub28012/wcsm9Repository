package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser create the obj of ChromeDriver class
	     WebDriver	driver=new ChromeDriver();
	    //maximize chromeBrowser
	     driver.manage().window().maximize();
	     // stop the execution of script for 2 sec
	     Thread.sleep(2000);
	     // close the browser
	     driver.close();
		
		
	}
	
	
}
