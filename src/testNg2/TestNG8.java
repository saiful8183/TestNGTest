package testNg2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG8 implements ITestListener {

	
	public void onTestStart(ITestResult result) {
	System.out.println("Stsrt succes:"+result.getName());
	}


	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test succes:"+result.getName());

	}

	
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test skipes:"+result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Test fail:"+result.getName());
	}


          public void onStart(ITestContext context) {
        	  System.out.println("Test fail:"+context.getName());
	}



}
