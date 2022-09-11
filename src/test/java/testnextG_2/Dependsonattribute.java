package testnextG_2;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonattribute {

    @Test(groups="a")
	public void tc1() {
		 
		Scanner sc =new Scanner(System.in);
		System.out.println("value of A");
		
	      int A  =sc.nextInt();
			   
	      System.out.println("i am in test case 1");
		  Assert.assertTrue(A>100,"A is invalid value");
		  Assert.assertEquals(A%2,0,"A is not even number");
		     
		
		
		
	}
    @Test(groups="a")
    public void tc2() {
    	int A =121;
    	System.out.println("i am in test case 2");
    	
    	Assert.assertEquals(A%2,1,"A is not even number");
    }
    @Test(dependsOnGroups="a",priority =-1)
    public void tc3() {
    	
    	System.out.println("i am in tc3");
    	
    
    
    
    
    	
    }
	
	
	
	
	
	
}
