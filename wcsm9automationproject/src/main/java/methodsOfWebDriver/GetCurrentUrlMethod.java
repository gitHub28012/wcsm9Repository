package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-k0cq021/login.do");
		
		// take a url of login page
		String urlOfLoginPage = driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		Thread.sleep(2000);
		
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
//		// take a url of HomePage
//		String urlOfHomePage = driver.getCurrentUrl();
//		System.out.println(urlOfHomePage);
//		
		
		
		driver.quit();
	}

}
