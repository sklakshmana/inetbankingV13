package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{

	
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase Started and TestCase details are : "+result.getName());
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase Success and TestCase details are : "+result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase Failed and TestCase details are : "+result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase Skipped and TestCase details are : "+result.getName());
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
