package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/singleSelectDropDown.html");
		//identify dropDown and store it in ref variable
		WebElement menuDropDown = driver.findElement(By.id("idddd"));
		
		//get all the options of menuDropDown
		Select sel = new Select(menuDropDown);
		List<WebElement> allOps = sel.getOptions();
		
		//to eliminate duplicates we use HashSet 
		   HashSet<String> hs = new HashSet<String>();
		   
		//read the list by using for loop and eliminate duplicates 
		   for(int i=0;i<allOps.size();i++)
		   {
			   WebElement op = allOps.get(i);
			   
			   //get the text of WebElement
			   String dropDownOption = op.getText();
			   
			   System.out.println(dropDownOption);
			   Thread.sleep(2000);
			   
			   // add the dropDownOption into HashSet and remove duplicates from DropDown
	            hs.add(dropDownOption);	   
		   }
		   
		  Thread.sleep(2000); 
		  // read the options from HashSet by using for each loop
		  for(String opt:hs)
		  {
			  Thread.sleep(2000); 
			  System.out.println(opt);
		  }
		
	  	
	}

}
