package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/singleSelectDropDown.html");
		
		//single select dropDown
		
		WebElement dropDown1 = driver.findElement(By.id("idddd"));
		
		// handle the dropDown
		Select sel = new Select(dropDown1);
		//select the option from dropDown
		Thread.sleep(2000);
		sel.selectByValue("v7");
		Thread.sleep(2000);
		// get the option which is selected first
		WebElement firstOpt = sel.getFirstSelectedOption();
		//get the text of firstOpt
		
		System.out.println(firstOpt.getText());
		Thread.sleep(2000);
		
	// multi select dropDown
		driver.navigate().to("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/MultiSelectDropDown.html");
		
	//identify dropDown
		WebElement dropDown2 = driver.findElement(By.id("idddd"));
		
		//handle the multi select dropDown
		Select sel2 = new Select(dropDown2);
		
		//select multiple option from multi select dropDown
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		
		// get option which is selected first
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
	}

}
