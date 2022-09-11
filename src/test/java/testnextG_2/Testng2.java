package testnextG_2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2 {
	

@BeforeClass
public void Tc7() {
	System.out.println("The latest one");
}
@BeforeMethod
public void Tc8() {
	System.out.println("The latest second one");
}
@Test
public void T9() {
	System.out.println("The latest Third one");
}

@Test(invocationCount=3,priority=-1)
public void Tc10() {
	System.out.println("The Testcase 10");
	
}
@Test(priority=-2)
public void Tc11() {
	System.out.println("The Testcase 11");

}
@Test(invocationCount=3,priority=-1)
public void Tc12() {
	System.out.println("The Testcase 12");
}
}
