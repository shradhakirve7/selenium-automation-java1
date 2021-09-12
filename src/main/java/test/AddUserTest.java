package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodImpl;
import pages.AddUserPage;
//import pages.AdduserPage;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
@Listeners(IInvokedMethodImpl.class)
public class AddUserTest {
	@Test
	public void VerifyAddEmployeeSuccessfully()
	{  
		LoginPage lp=new LoginPage();
		lp.login("Admin","admin123").navigateToAdminPage()
		.navigatetoAddUserPage()
		.adduser("ESS", "shradha", "Shradha", "Enabled", "shradha");
		System.out.println("hello");
		
}
}