package Testingfilestestng;

import org.testng.annotations.Test;

public class Dependencyanito {
	
	
	
	@Test
	public void iphone()
	{
		System.out.println("connect to laptop to sync songs");
	}

	@Test(dependsOnMethods=("iphone"))
	public void Mac()
	{
		System.out.println("After sync select all songs to download");
	}
	
}
