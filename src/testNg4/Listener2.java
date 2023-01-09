package testNg4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start success:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success:"+result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failuar success:"+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skiped success:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Start success:"+result.getName());	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Start success:"+result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish success:"+context.getName());	
	}

}
