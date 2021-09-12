package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.WebDriverFactory;

public class HomePage {
	@FindBy(id = "welcome")
	private WebElement welcomeText;
	@FindBy(xpath ="//b[text()='Admin']")
	private WebElement admintab;
	@FindBy(id = "menu_admin_UserManagement")
	WebElement usermngmnt;

	WebDriverWait wait;

	public HomePage() {
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory.threadStorage.get(), 30);
	}

	public AdminPage navigateToAdminPage() {
		admintab.click();
		AdminPage ap = new AdminPage();
		return ap.isPageLoaded();
		// usermngmnt.click();

	}

	public HomePage isPagedisplay() {
		wait.until(ExpectedConditions.elementToBeClickable(admintab));
		// wait.until(ExpectedConditions.visibilityOf(usermngmnt));
		return this;

	}

	public void verifyWelcomeText(String ExpectedWelcomeText) {
		Assert.assertEquals(welcomeText.getText().contains("Welcome"), ExpectedWelcomeText, "welcome is ");
	}

}
