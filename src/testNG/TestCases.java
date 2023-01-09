package testNG;


import org.testng.Assert;  
import org.testng.annotations.Test; 

public class TestCases {



  
@Test  
public void testtopass()  
{  
Assert.assertTrue(true);  
}  
@Test  
public void testtofail()  
{  
Assert.assertFalse(false);  
}  
}  