package testNG;

import org.testng.annotations.Test;

public class Module1 {


    @Test  
    public void test1()  
    {  
        System.out.println("Hello javaTpoint!!");  
    }  
      
    @Test(priority=2)                     //enabled=false)  
    public void test2()  
    {  
        System.out.println("JTP Travels");  
    }}  


