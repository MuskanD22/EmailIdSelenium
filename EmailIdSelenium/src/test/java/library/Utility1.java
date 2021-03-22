package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility1 {

		public static String getScreenshot(WebDriver driver){
			String path="";
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			path=System.getProperty("C:\\Users\\muskan.dureja\\eclipse-workspace\\EmailIdSelenium\\Screenshots\\"+System.currentTimeMillis()+".png");
			
			File destination=new File(path);
			
			FileUtils.copyFile(src, destination);
			} catch (IOException e) 
			{
				System.out.println("Capture Failed "+e.getMessage());
			}
			
			return path;
		}
		
	}

