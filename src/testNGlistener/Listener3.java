package testNGlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener3 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
	System.out.println("Test start success:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test  success:"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test start success:"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test start success:"+result.getName());
	}



	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test start success:"+result.getName());
	}



	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println("Test start success:"+context.getName());
	}

}