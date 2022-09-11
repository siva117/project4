package testnextG_2;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void Tc7(ITestContext testcontest) {
		String suitename=testcontest.getSuite().getName();
		System.out.println(suitename);
	}
	@BeforeTest
	public void Tc8(ITestContext testcontest) {
	String Testname=testcontest.getCurrentXmlTest().getSuite().getName();
		System.out.println(Testname);
	}
	@BeforeClass
	public void T9() {
		System.out.println("i am in b4 class");
	}

	@BeforeMethod
	public void Tc10(Method method) {
		String methodname=method.getName();
		System.out.println(methodname);
		System.out.println("i am in B$ method");
		
	}
	@Test
	public void Tc11() {
		System.out.println("i am in tset");

	}
	@AfterMethod
	
	public void Tc13() {
		System.out.println("i am in A4 method");
	}
	@AfterClass
	public void Tc17() {
		System.out.println("i am in A4 class");
	}
	@AfterTest
	public void Tc18() {
		System.out.println("i am in A4 test");
	}
	@AfterSuite
	public void Tc19() {
		System.out.println("i am in A4 suite");
	}}
	
	
		
