package assignmentPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistaraScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		// handle notification pop in Chrome Browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		
		
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("BOM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='depart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date='29']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='business']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'col-xs-12 d')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("book-flight-widget")).click();
		
		
	}

}
