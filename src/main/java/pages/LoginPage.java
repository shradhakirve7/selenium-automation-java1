package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class LoginPage {
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement paswd;
	
	@FindBy(id="btnLogin")
	WebElement btnlogin;
	
	WebDriverWait wait;
	
	public LoginPage()
	{
		
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		//wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),30);
	}
	
	public HomePage login(String uname,String pswd)
	{
		
		username.sendKeys(uname);
		paswd.sendKeys(pswd);
		btnlogin.click();
		
		HomePage hp=new HomePage();
		return hp.isPagedisplay(); 
	
	}
	/*public  isPageDisplay()
	{
			
		wait.until(ExpectedConditions.visibilityOf(btnlogin));
	}
*/
}
