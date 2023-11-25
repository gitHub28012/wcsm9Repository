package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// store all the modules of homepage 
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img") private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::img") private WebElement Tasks_Module;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::img") private WebElement Reports_Module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::img") private WebElement Users_Module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img") private WebElement Work_Schedule_Module;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::img") private WebElement Settings_Module;
	@FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization

	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}

	public WebElement getTasks_Module() {
		return Tasks_Module;
	}

	public WebElement getReports_Module() {
		return Reports_Module;
	}

	public WebElement getUsers_Module() {
		return Users_Module;
	}

	public WebElement getWork_Schedule_Module() {
		return Work_Schedule_Module;
	}

	public WebElement getSettings_Module() {
		return Settings_Module;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	
	//operational methods
	
	public void click_on_Time_Track_Module()
	{
		Time_Track_Module.click();
	}
	
	public void click_on_Tasks_Module()
	{
		Tasks_Module.click();
	}
	
	public void click_on_Reports_Module()
	{
		Reports_Module.click();
	}
	
	public void click_on_Users_Module()
	{
		Users_Module.click();
	}
	
	public void click_on_Work_Schedule_Module()
	{
		Work_Schedule_Module.click();
	}
	
	public void click_on_Settings_Module()
	{
		Settings_Module.click();
	}
	
	public void logout_Method()
	{
		Logout_Link.click();
	}

}
