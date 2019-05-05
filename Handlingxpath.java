package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghuvicky\\Desktop\\Lib's\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.spicejet.com");
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")).click();
	Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
	dropdown.selectByIndex(3);
	dropdown.selectByValue("6");
	dropdown.selectByVisibleText("9 Adults");
	System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	
	Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']")));
	dropdown1.selectByValue("2");
	dropdown1.selectByVisibleText("4 Children");
	
	//selecting dropdown for currency
	Select dropdown2=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']")));
	dropdown2.selectByValue("INR");
	
	}

}
