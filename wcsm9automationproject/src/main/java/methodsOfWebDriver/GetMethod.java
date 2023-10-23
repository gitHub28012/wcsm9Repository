package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		// open the chrome browser
		WebDriver driver=new ChromeDriver();
		// maximize the chrome browser
		driver.manage().window().maximize();
		// launch the webapplication
		driver.get("https://www.primevideo.com");
		// stop the execution of script for 2 sec
		Thread.sleep(2000);
		// close the browser
		driver.close();
		
	}

}
