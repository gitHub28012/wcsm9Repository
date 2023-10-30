package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {
	
	// directly create the obj of browser specific classes 
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		// take a ss of demoapps
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/demoappsSS.jpg");
		
		Files.copy(src, dest);
		
	}

}
