package popHandlePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUp {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		WebElement targetElement = driver.findElement(By.name("file"));
		
		//perform doubleclick  on target element
		Actions act = new Actions(driver);
		act.doubleClick(targetElement).perform();
		
		Thread.sleep(2000);
		
		File file = new File("./autoITPgm/FileUpload2.exe");
		
		String absPath = file.getAbsolutePath();
		
		Runtime.getRuntime().exec(absPath);
		Thread.sleep(2000);
		Runtime.getRuntime().exec(absPath);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
