package WebUIpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghuvicky\\Desktop\\Lib's\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.bestbuy.com/");
		Actions Raghu = new Actions(driver);
		Thread.sleep(5000);
		WebElement element =driver.findElement(By.xpath(".//*[@id='menu1']"));
		Thread.sleep(5000);
		Raghu.moveToElement(element).build().perform();
	    Thread.sleep(5000);
		WebElement abc=driver.findElement(By.xpath(".//*[@id='gh-search-input']"));
		Thread.sleep(5000);
	    Raghu.keyDown(Keys.SHIFT).moveToElement(abc).sendKeys("welcome to automate").build().perform();
	    Thread.sleep(5000);
	    Raghu.contextClick(abc).build().perform();
	    
	}

}
