package testNg2;

import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	
	public void onTestStart(ITestResult result) {  
    System.out.println("Test cases Started :"+result.getName()); 
         
   }  
 
  
   public void onTestSuccess(ITestResult result) {  
         
       System.out.println("Test cases Success: "+result.getName());  
   }  
 
   
   public void onTestFailure(ITestResult result) {  
      
       System.out.println("Test cases Failure : "+result.getName());  
   }  
 
   
   public void onTestSkipped(ITestResult result) {  
      
       System.out.println("Test cases Skip:"+result.getName());  
   }  
 
  
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
     

   }  
 
  
   public void onStart(ITestContext context) {  
       
         
   }  
 
   
   public void onFinish(ITestContext context) {  
   	  System.out.println("completed of test cases:"+context.getName());
         
   }  
}  



