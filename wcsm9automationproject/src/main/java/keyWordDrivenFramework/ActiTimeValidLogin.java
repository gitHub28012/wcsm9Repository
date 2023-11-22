package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// to launch the browser and close the browser 
		BaseTest bt = new BaseTest();
		
		//to read data from property file
		Flib flib = new Flib();
		
		bt.openBrowser();
		
		//identify username Text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Username"));
		//identify password Text Box
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Password"));
		//identify login Button and click
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();
	}

}
