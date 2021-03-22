package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void VerifyPageTitle(String browserName) throws Exception {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEBrower\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
