package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest
{
    public void acceptAlert_ConfirmartionPopUp()
    {
    	driver.switchTo().alert().accept();
    }
    
    public void dismissAlert_ConfirmationPopUp()
    {
    	driver.switchTo().alert().dismiss();
    }
    
    public void handleFrameByIndex(int index)
    {
    	driver.switchTo().frame(index);
    }
    
    public void handleFrameByNameorId(String nameOrId)
    {
    	driver.switchTo().frame(nameOrId);
    }
    
    public void handleFrameByElement(WebElement ele)
    {
    	driver.switchTo().frame(ele);
    }
    
    public void switchToDefault()
    {
    	driver.switchTo().defaultContent();
    }
    
    public void handleDropDownByIndex(WebElement ele, int index)
    {
    	Select sel = new Select(ele);
    	sel.selectByIndex(index);
    }
    
    public void handleDropDownByValue(WebElement ele,String value)
    {
    	Select sel = new Select(ele);
    	sel.selectByValue(value);
    }
    
    public void handleDropDownByVisibleText(WebElement ele,String text)
    {
    	Select sel = new Select(ele);
    	sel.selectByVisibleText(text);
    }
    
    public void rightClick(WebElement target)
    {
    	Actions act = new Actions(driver);
    	act.contextClick(target).perform();
    }
    
    public void mouseHover(WebElement target)
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(target).perform();
    }
}
