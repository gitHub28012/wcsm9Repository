package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the web application by using navigate();
		Navigation nav = driver.navigate();
		nav.to("https://www.selenium.dev");
		Thread.sleep(2000);
		// to perform backward operation
		nav.back();
		Thread.sleep(2000);
		// to perform forward operation
		nav.forward();
		Thread.sleep(2000);
		//to perform refresh operation
		nav.refresh();
		
	}

}
