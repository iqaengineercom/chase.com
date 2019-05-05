package Testingfilestestng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {
	
	@BeforeSuite
	public void installingapp()
	{
		System.out.println("I am using the given link to download file first");
	}
	
	@AfterSuite
	public void unistallapp()
	{
		System.out.println("I will uninstall all files after finishing");
	}
	
	

}
