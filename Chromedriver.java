package chromedriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Chromedriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghuvicky\\Desktop\\Lib's\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String browserTitle = driver.getTitle();
		System.out.println("The title of the browser is " + browserTitle);
		
	}
}
