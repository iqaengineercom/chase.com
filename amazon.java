package chromedriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.com");
	driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']")).click();
	driver.findElement (By.id("ap_email")).sendKeys("vickyraghu4@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("12548");
	driver.findElement (By.id("signInSubmit")).click();
	driver.findElement(By.linkText(" Forgot your password?")).click();
	
	
	

	

	}

}
