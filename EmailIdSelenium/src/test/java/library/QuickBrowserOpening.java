package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class QuickBrowserOpening {
	static WebDriver driver;
	public static WebDriver StartBrowser(String BrowserName,String URL) {
		//driver.manage().window().maximize();
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEBrower\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
				
		}
		driver.get(URL);
		return driver;
	}
}
