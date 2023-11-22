package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//To launch the browser  and close the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read the data from excel file 
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{	
		String invalidUsn = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds",i,0);
		String invalidPass = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds",i,1);
		
	
		        //identify username Text box
				WebElement usnTB = driver.findElement(By.name("username"));
				usnTB.sendKeys(invalidUsn);
				//identify password Text Box
				WebElement passTB = driver.findElement(By.name("pwd"));
				passTB.sendKeys(invalidPass);
				//identify login Button and click
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("username")).clear();
				
				
		}	
		bt.closeBrowser();
	}

}
