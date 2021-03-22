package HeadlessBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import library.Utility;

public class PhantomJs {
	@Test
	public void VerifyTitle() {
		File src=new File("C:\\Users\\muskan.dureja\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		
		driver.get("http://facebook.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		Utility.captureScreenshots(driver, "phantomJs");
	}
}
