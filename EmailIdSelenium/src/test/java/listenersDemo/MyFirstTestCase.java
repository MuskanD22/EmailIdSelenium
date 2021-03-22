package listenersDemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Listeners(listenersDemo.TestNGListener.class)
public class MyFirstTestCase {
	@Test
	public void GoogleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
