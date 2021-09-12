package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;
import okio.Timeout;

public class AddUserPage {
	//	@FindBy(id="btnAdd")
//	private WebElement addUserButton;
	
	
	@FindBy(id="systemUser_userType")
	private WebElement userRole ;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement empName;
	
	@FindBy(id="systemUser_userName")
	private WebElement userName;
		
	@FindBy(id="systemUser_status")
	private WebElement userStatus;
		
	@FindBy(id="systemUser_password")
	private WebElement userpswd;
	
	WebDriverWait wait;
	
 public AddUserPage() 
		// TODO Auto-generated con
	{
		
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),30);
	}
	
 public AdminPage adduser(String UserRole,String Ename,String uName,String Ustatus,String UPswd)
	{
		userRole.sendKeys(UserRole);
		empName.sendKeys(Ename);
		userName.sendKeys(uName);
		userStatus.sendKeys(Ustatus);
		userpswd.sendKeys(UPswd);
		return new AdminPage().isPageLoaded();
			
	}
 public AddUserPage isPagedisplay()
	{
		wait.until(ExpectedConditions.visibilityOf(userName));
		wait.until(ExpectedConditions.visibilityOf(empName));
		
		return this;
		
	}
	
	

}
