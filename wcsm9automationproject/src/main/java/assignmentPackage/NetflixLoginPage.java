package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the netflix
		driver.get("https://www.netflix.com/in/Login");
		
		Thread.sleep(2000);
		
		//identify phone or Email text box
		driver.findElement(By.id("id_userLoginId")).sendKeys("asdfghjkl");
		Thread.sleep(2000);
		
		//identify password text box
		driver.findElement(By.id("id_password")).sendKeys("zxcvbnm");
		
		Thread.sleep(2000);
		//identify sign in button
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		
		
		
	}

}
