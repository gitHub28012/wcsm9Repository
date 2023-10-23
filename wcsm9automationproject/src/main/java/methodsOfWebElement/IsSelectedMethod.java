package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	// verify check box on login page 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-k0cq021/login.do");
		
		//identify check box for verify 
		WebElement checkBoxElement = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		//check the checkbox is selected or not
		boolean status = checkBoxElement.isSelected();
		System.out.println(status);
		
		//select the check box verify the status 
		checkBoxElement.click();
		
		boolean status1 = checkBoxElement.isSelected();
		System.out.println(status1);
	}

}
