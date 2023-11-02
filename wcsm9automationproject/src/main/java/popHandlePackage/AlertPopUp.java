package popHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		// generate alert pop up
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		// handle alert pop up
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		// accept alert pop up
	   Thread.sleep(2000);
//	   alert.accept();
	   
	   // get the text of alert pop up
	   String textOfAlert = alert.getText();
	   System.out.println(textOfAlert);
	   
	 //  alert.sendKeys("tanmay");
	   
	   //dismiss alert pop up
	   alert.dismiss();
		
		
		
		
	}

}
