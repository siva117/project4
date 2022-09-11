package testnextG_2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_2 {

	@DataProvider()
	
	public Object[][] takeData(){
		
		    Object [][] arr = new Object[2][4];
		
		       arr[0][0]="A";
		       arr[0][1]="B";
		       arr[0][2]="C";
		       arr[0][3]="sfan";
		       arr[1][0]="D";
		       arr[1][1]="E";
		       arr[1][2]="F";
		       arr[1][3]="sfan";
		       
		    
	return arr;	
		
	}
//	@Test(dataProvider="takeData")
//	public void sampletc(String A,String B,String C,String D) {
//		System.out.println(A+"="+B+"="+C+"="+D);
//		
//	}
	
	
	@Test(priority=1,invocationCount=4)
	public void Tc1() {
		System.out.println("i am in 1");
	}
	@Test(priority=-2,groups="movies",dependsOnMethods="Tc1")
	public void Tc2() {
		System.out.println("i am in 2");
	}
//	@Test(priority=2,groups={"movies","news","sports"})
//	public void Tc3() {
//		System.out.println("i am in 3");
//	}
//	@Test(priority=3,groups="sports")
//	public void Tc4() {
//		System.out.println("i am in 4");
//	}
//	@Test(priority=5,groups="news")
//	public void Tc5() {
//		System.out.println("i am in 5");
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
