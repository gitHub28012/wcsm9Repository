package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		// identify usernameTB by using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		//identify passwordTB by using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		
		//identify login Button by using cssSelector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
