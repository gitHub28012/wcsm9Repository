package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/MultiSelectDropDown.html");
		
		
	
		// multiselect DropDown
		WebElement menuDropDown = driver.findElement(By.id("idddd"));
		
		Select sel = new Select(menuDropDown);
		
		//select the multiple options from menu dropDown
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		
		//read only the selected options from menu dropDown
		List<WebElement> allOpts = sel.getAllSelectedOptions();
		
		//read the list by using for loop
//		for(int i=0;i<allOpts.size();i++)
//		{
//			String op = allOpts.get(i).getText();
//			Thread.sleep(2000);
//			System.out.println(op);
//		}
		
		// read the list by using for each loop
		for(WebElement opt:allOpts)
		{
			String op = opt.getText();
			Thread.sleep(2000);
			System.out.println(op);
		}
		
	}

}
