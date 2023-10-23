package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-k0cq021/login.do");
		
		// take a source code of login page
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
