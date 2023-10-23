package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	
	// verify the log out link in home page of actiTime.
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-k0cq021/login.do");
		
		// identify username text box and pass admin
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button and click
		driver.findElement(By.id("loginButton")).submit();
		
		//identify log out link for verify
		WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
		
		//check for logoutLinkElement is displayed or not
		boolean status = logoutLinkElement.isDisplayed();
		System.out.println(status);
	}

}
