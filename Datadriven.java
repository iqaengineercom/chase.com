package datadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven 
{
	
	
	@Test(dataProvider="getData")
	public void Userid(String username,String password,String id)
	{
		System.out.println("The page have the credentials to open webpage");
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
	
	Object[][] data=new Object[3][3];
	data[0][0]="1abde";
	data[0][1]="1xysw";
	data[0][2]="1raghu";
	data[1][0]="2janv";
	data[1][1]="2raghav";
	data[1][2]="2rajender";
	data[2][0]="3ravi";
	data[2][1]="3praveen";
	data[2][2]="3suresh";
	
	return data;
}

}
