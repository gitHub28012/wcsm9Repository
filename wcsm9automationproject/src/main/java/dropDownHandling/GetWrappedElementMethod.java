package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/singleSelectDropDown.html");
		
		//single select dropDown
		
		WebElement dropDown1 = driver.findElement(By.id("idddd"));
		
		// handle dropDown
		Select sel = new Select(dropDown1);
		
		//get all the options from dropDown By using getWrappedElement
		
		WebElement allOps = sel.getWrappedElement();
		
		System.out.println(allOps.getText());
		
		//get all the options from dropDown By using getOptions
		List<WebElement> options = sel.getOptions();
		
		// select the option from dropDown without using selection method
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
		   if(opt.getText().equals("vadapav"))
		   {
			   opt.click();
			   break;
		   }
		}
		
		
		
		
	
	}

}
