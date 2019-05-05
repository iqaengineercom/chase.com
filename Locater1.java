package locater;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locater1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://www.msn.com");
		driver.findElement(By.xpath(".//*[@id='sb_form_go']")).click();*/
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("raghu1234");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/a")).click();
		
		
		
	}

}
