package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AdminPage {

	@FindBy(id="btnAdd")
	 WebElement addUserButton;
	
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement usermngmnt;
	
	WebDriverWait wait;
	
	
 public AdminPage() 
		// TODO Auto-generated con
	{
		
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),30);
	}
	
	public AddUserPage navigatetoAddUserPage()
	{
		addUserButton.click();
		AddUserPage au=new AddUserPage();
		return new AddUserPage().isPagedisplay() ;
	}
	
	public AdminPage isPageLoaded()
	{
		wait.until(ExpectedConditions.visibilityOf(addUserButton));
		return this;
		
	}

}
