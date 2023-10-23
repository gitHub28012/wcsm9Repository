package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeslectionMethods {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify dropDown  option and click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//identify ph.no dropdown it is single select
		WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/1')]"));
		
		Select sel = new Select(dropDown1);
		Thread.sleep(2000);
		//select the option from single select dropDown
		sel.selectByIndex(2);
		
		//deselect the option from single select dropDown
		Thread.sleep(2000);
	//	sel.deselectByIndex(2);
		
		
		// perform deselection on multiSelect DropDown.
		driver.navigate().to("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/MultiSelectDropDown.html");
	 	//identify dropdown that is multiSelect
	 	WebElement dropDown2 = driver.findElement(By.id("idddd"));
	 	
	 	   Select sel2 = new Select(dropDown2);
	 	   
	 	 //select and deselect option by using index  
	 	   Thread.sleep(2000); 
	 	   sel2.selectByIndex(2);
	 	//   Thread.sleep(2000); 
	 	//   sel2.deselectByIndex(2);
	 	   
	 	//select and deselect multiple option by using index  
	 	   for(int i=0;i<=4;i++)
	 	   {
	 		   Thread.sleep(2000); 
	 		   sel2.selectByIndex(i);
	 	   }
	 	//  Thread.sleep(2000); 
	 	  
//	 	  for(int i=0;i<=4;i++)
//	 	  {
//	 		 Thread.sleep(2000); 
//	 		 sel2.deselectByIndex(i);
//	 	  }
	 	 Thread.sleep(2000); 
	 	 //select and deselect option by using value
	 	  sel2.selectByValue("v2");
	 	//  Thread.sleep(2000); 
	 	  //sel2.deselectByValue("v2");
	 	  
	 	  //select and deselect option by using visible text
	 	  sel2.selectByVisibleText("Misal");
	      Thread.sleep(2000); 
	 	 // sel2.deselectByVisibleText("Misal");
	 	   
	      sel2.deselectAll();
		
		
	}

}
