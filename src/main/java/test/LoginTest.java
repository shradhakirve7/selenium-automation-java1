package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

	@Test
	public void verifyuserLoginsuccessful()
	{
		LoginPage lp=new LoginPage();
		lp.login("Admin", "admin123");
		
		HomePage hp=new HomePage();
		hp.verifyWelcomeText("Welcome ESS");
		
	}
	@Test
	public void verifyuserUnsuccessful()
	{
		
		LoginPage lp=new LoginPage();
		lp.login("Ad","admi");
		
	}
	
	
}
