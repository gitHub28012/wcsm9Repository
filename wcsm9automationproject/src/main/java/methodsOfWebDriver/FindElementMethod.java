package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	
	public static void main(String[] args) {
		// launch the browsers
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-k0cq021/login.do");
		
		//identify usernameTextBox
		WebElement usnTB = driver.findElement(By.name("usern"));
		System.out.println(usnTB);
		usnTB.sendKeys("admin");
	}

}
