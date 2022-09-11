package testnextG_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcasesforanntations {
     @BeforeSuite(groups="x")
	public void tc1() {
		
		System.out.println("i ll execute before suite");
	}
	@BeforeTest(groups="k")
	public void tc2() {
		
		System.out.println("i ll execute before Test ");
	}
	@BeforeClass(groups="x")
	public void tc3() {
		System.out.println("i ll execute before Class");
	}
	@BeforeMethod(groups="y")

	public void tc4 () {
	System.out.println("i ll execute before Method");
   }  
	@Test(groups="x")
	public void tc111() {
		
		System.out.println("i am a main test case");
	}
		
	@AfterMethod(groups="y")
	public void tc5() {
		System.out.println("i ll execute after method");
	}
	@AfterClass (groups="z")
	public void tc6() {
		System.out.println("i ll execute after class");
	}
	@AfterTest(groups="z")

	public void tc7() {
		System.out.println("i ll execute after test");
	}
	@AfterSuite(groups="z")

   public void tc8() {
	   System.out.println("i ll execute after suite");
   }
	
	}
