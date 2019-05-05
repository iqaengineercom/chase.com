package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement (By.id("gmail-sign-in)")).click();
		driver.findElement(By.xpath("..//*[@id='Email']")).sendKeys("raghava8514@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.id("Passwd")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();

	}

}
