package testnextG_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	

		
		@Test
		public void tc1() {
		
		String s="siva";
		String st="siva";
		String s1="krishna";
		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(s, st);
		
		Assert.assertEquals(s, s1);
		Assert.assertEquals(false, false);
	}
		
	
	
	

	
	
	
	
}
