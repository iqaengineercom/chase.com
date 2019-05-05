package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Customizedxpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghuvicky\\Desktop\\Lib's\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("raghu007");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("124578");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
