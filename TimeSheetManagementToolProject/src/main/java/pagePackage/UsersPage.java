package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class UsersPage {
	
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement CreateNewUsersButton;
	
	@FindBy(name="username")
	private WebElement usernameTB;	
	@FindBy(name="passwordText")
	private WebElement passwordTB;
	@FindBy(name="passwordTextRetype")
	private WebElement retypePasswordTB;
	
	
	@FindBy(name = "firstName")
	private WebElement FirstNameTB;
	@FindBy(name = "lastName")
	private WebElement LastNameTB;
	
	
    @FindBy(name = "rightGranted[12]")
    private WebElement ModifyTimeTrackOtherCheckBox;
    @FindBy(name="rightGranted[2]")
    private WebElement ManageCustomer_ProjectsCheckBox;
    @FindBy(name = "rightGranted[13]")
    private WebElement ManageTasksCheckBox;
    @FindBy(id="right5")
    private WebElement ManageUsersCheckBox;
    @FindBy(id="right7")
    private WebElement ManageBillingTypeCheckBox;
    @FindBy(xpath = "//input[@value='   Create User   ']")
    private WebElement CreateUserButton;
    @FindBy(name = "rightGranted[1]")
    private WebElement genetareReportCheckBox;
    
    @FindBy(xpath = "(//td[@class='listtblcell' and @nowrap='1'])[1]")
    private WebElement newCreatedManager;
    @FindBy(xpath = "//input[@value='Delete This User']")
    private WebElement DeleteUsersButton;
    
    
    public UsersPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }



	public WebElement getCreateNewUsersButton() {
		return CreateNewUsersButton;
	}



	public WebElement getUsernameTB() {
		return usernameTB;
	}



	public WebElement getPasswordTB() {
		return passwordTB;
	}



	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}



	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}



	public WebElement getLastNameTB() {
		return LastNameTB;
	}



	public WebElement getModifyTimeTrackOtherCheckBox() {
		return ModifyTimeTrackOtherCheckBox;
	}



	public WebElement getManageCustomer_ProjectsCheckBox() {
		return ManageCustomer_ProjectsCheckBox;
	}



	public WebElement getManageTasksCheckBox() {
		return ManageTasksCheckBox;
	}



	public WebElement getManageUsersCheckBox() {
		return ManageUsersCheckBox;
	}



	public WebElement getManageBillingTypeCheckBox() {
		return ManageBillingTypeCheckBox;
	}



	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}
    
	
	
    
	public WebElement getGenetareReportCheckBox() {
		return genetareReportCheckBox;
	}


	
	public WebElement getNewCreatedManager() {
		return newCreatedManager;
	}



	public WebElement getDeleteUsersButton() {
		return DeleteUsersButton;
	}



	public void usersLoginCredsMethod(String usn,String pass) throws InterruptedException
	{
	   CreateNewUsersButton.click();
	
		//Login 
		usernameTB.sendKeys(usn);
		
		passwordTB.sendKeys(pass);
		
		retypePasswordTB.sendKeys(pass);
		
	}

	public void usersContact_AccessMethod(String FirstName,String LastName) throws InterruptedException
	{
		
		
	
		//contact
		FirstNameTB.sendKeys(FirstName);
		
		LastNameTB.sendKeys(LastName);
		
		
		//Access
		ModifyTimeTrackOtherCheckBox.click();
		genetareReportCheckBox.click();
		ManageTasksCheckBox.click();
		ManageUsersCheckBox.click();
		ManageBillingTypeCheckBox.click();
		 
		CreateUserButton.click();
		
	}
	
	public void deleteUsersMethod()
	{
		newCreatedManager.click();
		DeleteUsersButton.click();
		WorkLib wlb = new WorkLib();
		wlb.acceptAlert_ConfirmartionPopUp();
	}
    


}
