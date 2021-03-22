package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyGoogleTitle {
	@Test
	public void VerifyTitle() {
			WebDriver driver=new HtmlUnitDriver();
			driver.get("http://www.facebook.com");
			String title=driver.getTitle();
			Assert.assertTrue(title.contains("Facebook"));
	}
	
	@Test
	public void VerifyTitleNew() {
			WebDriver driver=new HtmlUnitDriver();
			driver.get("http://www.facebook.com");
			String title=driver.getTitle();
			Assert.assertTrue(title.contains("sel"));
	}
}
