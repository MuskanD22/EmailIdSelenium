package Email;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class EmailTesting {
  @Test
  public void myTest() {
	  int a=10;
	  int b=10;
	  Assert.assertEquals(a, b);
	  System.out.println("Test done");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Mail Sending........");
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  if(result.getStatus()==ITestResult.FAILURE) {
	  SendEmailJava.sendMail();
  }
  }
}
