package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericPackage.WorkLib;

public class TasksPage {
	// store all the WebElements of TasksPage
	
	@FindBy(partialLinkText = "Projects & Customers") 
	private WebElement Projects_Customers_Sub_Module;
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement Create_new_customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement Create_new_project_Button;
	
	@FindBy(name = "name")
	private WebElement customer_nameTB;
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomer_Button;
	
	@FindBy(name = "customerId")
	private WebElement customer_name_Dropdown;
	@FindBy(name = "name")
	private WebElement project_nameTB;
	@FindBy(name = "createProjectSubmit")
	private WebElement createProject_Button;
	
	@FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[8]/td[6]/input")
	private WebElement checkboxOfProject_Customer;
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteSelectedButton;
	@FindBy(id = "deleteButton")
	private WebElement deleteButton;
	
	//initialization
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getProjects_Customers_Sub_Module() {
		return Projects_Customers_Sub_Module;
	}


	public WebElement getCreate_new_customer_Button() {
		return Create_new_customer_Button;
	}


	public WebElement getCreate_new_project_Button() {
		return Create_new_project_Button;
	}


	public WebElement getCustomer_nameTB() {
		return customer_nameTB;
	}


	public WebElement getCreateCustomer_Button() {
		return createCustomer_Button;
	}


	public WebElement getCustomer_name_Dropdown() {
		return customer_name_Dropdown;
	}


	public WebElement getProject_nameTB() {
		return project_nameTB;
	}


	public WebElement getCreateProject_Button() {
		return createProject_Button;
	}
	
	
	
	public WebElement getCheckboxOfProject_Customer() {
		return checkboxOfProject_Customer;
	}


	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}


	public WebElement getDeleteButton() {
		return deleteButton;
	}


	//operational Methods
	public void createcustomer_createproject_method(String cust_name,String pro_name) throws InterruptedException
	{
		Projects_Customers_Sub_Module.click();
		Thread.sleep(1000);
		Create_new_customer_Button.click();
		Thread.sleep(1000);
		customer_nameTB.sendKeys(cust_name);
		createCustomer_Button.click();
		Thread.sleep(1000);
		Create_new_project_Button.click();
	    
		WorkLib wlb = new WorkLib();
		wlb.handleDropDownByVisibleText(customer_name_Dropdown, cust_name);
		
		Thread.sleep(1000);
		project_nameTB.sendKeys(pro_name);
		createProject_Button.click();		
		
	}
	
	public void deleteCustomers_Projects()
	{
		Projects_Customers_Sub_Module.click();
		checkboxOfProject_Customer.click();
		deleteSelectedButton.click();
		deleteButton.click();
	}
	

}
