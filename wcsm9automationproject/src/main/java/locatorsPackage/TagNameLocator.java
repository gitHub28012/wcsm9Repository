package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/SimpleLogin.html");
		
		Thread.sleep(2000);
		// identify usernameTB and pass input AS "admin"
        driver.findElement(By.tagName("input")).sendKeys("admin");	
        // identify passwordTB and pass input As "manager"
        Thread.sleep(2000);
        driver.findElement(By.tagName("input")).sendKeys("manager");
        
	}
}
