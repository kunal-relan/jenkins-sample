package priority1Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority1Cases {
	
	private static String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}




	@Test
	public void testPrintHelloWorld() {
		System.out.println("I belong to Priority 1 Test  Suite");
		Assert.assertEquals(getHelloWorld(), "Hello World");

	}

}
