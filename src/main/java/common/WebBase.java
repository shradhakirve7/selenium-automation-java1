package common;

import org.testng.annotations.DataProvider;

public class WebBase {
	@DataProvider(name="Login Data")
	public String[][] getLogindata()
	{
           String logindata[][]= {		
		                    {"admin","admin123"},
		                    {"add","adddd"}
          					};
return logindata;

	}	
}
	
	
	

