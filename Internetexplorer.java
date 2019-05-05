package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Raghuvicky\\Desktop\\Lib's\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
        String browserTitle = driver.getTitle();
        System.out.println("The title of the browser  is " + browserTitle);
	}

}
