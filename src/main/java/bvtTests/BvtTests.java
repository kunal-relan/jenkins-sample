package bvtTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BvtTests {
	
	private static String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}




	@Test
	public void testPrintHelloWorld() {
		System.out.println("I belong to BVT  Suite 0");
		Assert.assertEquals(getHelloWorld(), "Hello World");

	}
    
    
    @Test
    public void testPrintHelloWorld1() {
        System.out.println("I belong to BVT  Suite 1");
        Assert.assertEquals(getHelloWorld(), "Hello World");
        
    }
    
    @Test
    public void testPrintHelloWorld2() {
        System.out.println("I belong to BVT  Suite 2");
        Assert.assertEquals(getHelloWorld(), "Hello World");
        
    }
    
    @Test
    public void testPrintHelloWorld3() {
        System.out.println("I belong to BVT  Suite 3");
        Assert.assertEquals(getHelloWorld(), "Hello World");
        
    }
    
}
