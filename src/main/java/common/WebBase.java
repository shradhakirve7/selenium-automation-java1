package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
	
	@DataProvider(name="LoginCSVData")//read csv file
	public String[][] getLoginCSVData() throws IOException
	{
		
		String Filename="E:\\fileReader.csv";
		File file=new File(Filename);//get metadata
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line;
		String loginData[][]=new String[3][2];
		int i=0;

		while((line=br.readLine())!=null)
		{
			String data[]=line.split(",");
			loginData[i]=data;
			i++;
			}
			
		return loginData;	
		}	
			
}
		
		
		
		
		
		
		
		
	
	

