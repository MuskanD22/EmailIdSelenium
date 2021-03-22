package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {

		System.out.println("TestCase start working and details are "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("TestCase is success and details are "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("TestCase failed and details are "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("TestCase skipped and details are "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("TestCase failed but with success percentage and details are "+result.getName());
		
	}

	public void onStart(ITestContext context) {
		System.out.println("TestCase started and details are "+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("TestCase finished "+context.getName());
	}
	












}













