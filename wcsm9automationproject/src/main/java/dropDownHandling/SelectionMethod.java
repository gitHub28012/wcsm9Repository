package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify dropDown option and click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//identify ph.no dropdown
		WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/1')]"));
		
		Select sel3sel = new Select(dropDown1);
		Thread.sleep(2000);
		//select the option
		sel3sel.selectByIndex(2);
	
		
		//identify country dropdown
		WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	    Select sel2 = new Select(dropDown2);
	    Thread.sleep(2000);
	    sel2.selectByValue("India");
	    
	    //identify state dropdown
	    WebElement dropDown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
	    
	     Select sel3 = new Select(dropDown3);
	     Thread.sleep(2000);
	     sel3.selectByVisibleText("Maharashtra");
	     
	     
	     //handle multiselect dropDown
	     Thread.sleep(2000);
	     driver.navigate().to("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/MultiSelectDropDown.html");
	     
	     //identify dropDown
	     WebElement dropDown4 = driver.findElement(By.id("idddd"));
	     
	     Select sel4 = new Select(dropDown4);
	     
	   //  sel4.selectByIndex(5);
	     
	     //select multiple options from multiselect dropdown
	     Thread.sleep(2000);
	     for(int i=0;i<=5;i++)
	     {
	    	 sel4.selectByIndex(i);
	     }
	     
	     
	     Thread.sleep(2000);
	     driver.navigate().to("http://demoapps.qspiders.com/");
	     
	 	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
	 	driver.findElement(By.partialLinkText("Multi Select")).click();
	 	//identify dropdown
	 	WebElement dropDown5 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	 	
	    Select sel5 = new Select(dropDown5);
	    Thread.sleep(2000);
	    for(int i=0;i<=4;i++)
	    {
	     Thread.sleep(2000);
	    	sel5.selectByIndex(i);
	    }
	}

}
