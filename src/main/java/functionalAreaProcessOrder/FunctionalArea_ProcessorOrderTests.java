package functionalAreaProcessOrder;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalArea_ProcessorOrderTests {
	
	private static String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}




	@Test
	public void testPrintHelloWorld() {
		System.out.println("I belong to Functional Area Process Order Tests Suite");
		Assert.assertEquals(getHelloWorld(), "Hello World");

	}

}
