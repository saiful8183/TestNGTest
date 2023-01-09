package testNG;

import org.testng.ITestContext;  
import org.testng.ITestListener;  
import org.testng.ITestResult;  


	
	
	public class Listener implements ITestListener { 
	  
	  
	    
	    public void onTestStart(ITestResult result) {  
	    	  System.out.println("Start Successfully : "+result.getName()); 
	          
	
	    }  
	  
	    
	    public void onTestFailure(ITestResult result) {  
	       
	        System.out.println(" Test cases Failure : "+result.getName());  
	    }  
	  
	    
	    public void onTestSkipped(ITestResult result) {  
	       
	        System.out.println("Test cases Skip  : "+result.getName());  
	    }  
	  
 
	  
	    
	    public void onFinish(ITestContext context) {  
	    	  System.out.println("completed of test cases and its details are : "+context.getName());
	          
	    }  
	}  

