package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Report1{
ExtentReports report;
ExtentTest logger;
WebDriver driver;
@BeforeTest
public  void StartTest() {
	
	report=new ExtentReports("D:\\ReportDatareport1.html",true);
	
	logger=report.startTest("Report1");
	System.out.println("Pass");
	
}
@Test
public void Verifytitle() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
	System.out.println("Pass");
	driver = new ChromeDriver();
	logger.log(LogStatus.INFO, "Browser Started");
	driver.get("https://opensource-demo.orangehrmlive.com/");

	driver.manage().window().maximize();
	System.out.println("Pass");
	
	logger.log(LogStatus.INFO, "Application is uploaded");
	
	String title=driver.getTitle();
	if(driver.getTitle().equalsIgnoreCase("OrangeHRM")) {
		logger.log(LogStatus.PASS, "Navigate to site");
	}
	else {
		logger.log(LogStatus.FAIL, "Test Failed");
	}
}

@AfterClass
public void tearDown() {
	
	report.endTest(logger);
	report.flush();
	}

}
