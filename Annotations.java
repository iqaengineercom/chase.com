package Testingfilestestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeMethod
	public void credentials()
	{
		System.out.println("enter the username and password for facebook");
	}
	
	
	@BeforeTest
	public void userguideinfo()
	{
		System.out.println("Delete the credentials from links");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("close all the browsers");
	}
	
	@AfterTest
	public void deletecookies()
	{
		System.out.println("remove all the cookies from browser");
	}
	
	@Test
	public void openthebrowser()
	{
		System.out.println("open the google chrome Test 3");
	}
	
	@Test
	
	public void clickonfacebook()
	{
		System.out.println("click the facebook link Test 1");
	}
	
	@Test
	public void login()
	{
		System.out.println("login into the facebook account Test 2");
	}

}
