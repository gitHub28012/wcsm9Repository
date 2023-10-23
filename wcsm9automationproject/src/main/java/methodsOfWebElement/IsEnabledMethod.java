package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	// verify the login Button on Instagram
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		//identify usernameTextBox and pass inputs 
		driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("admin");

		//identify passwordTextBox and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("admin123");


		//identify login Button
		WebElement loginButtonElement = driver.findElement(By.xpath("//button[contains(@class,'acap ')]"));

		// verify login Button is disable or enable 
		boolean status = loginButtonElement.isEnabled();
		System.out.println(status);

		// will click on button by using click method
		//loginButtonElement.click();
		
		// will click on button by using submit method
		loginButtonElement.submit();


	}

}
