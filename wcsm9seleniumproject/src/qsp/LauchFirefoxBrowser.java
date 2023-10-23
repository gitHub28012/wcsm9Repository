package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		// to launch the firefox browser create the obj of FirefoxDriver(c)
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		// stop the execution of script for 2 sec
		System.out.println("Firefox is Open!!");
		
		Thread.sleep(2000);
		// to close firefox
		driver.close();
		System.out.println("firefox is close!!!");
		
		
		
		
		

	}

}
