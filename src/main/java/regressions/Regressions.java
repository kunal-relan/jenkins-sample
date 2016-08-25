package regressions;

import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Regressions {
	
	private static String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}




	@Test
	public void testPrintHelloWorld() {
		System.out.println("I belong to Regression Suite");
			Assert.assertEquals(5, 10);
	}
    @Test
    public void testPrintHelloWorld1() {
        System.out.println("I belong to Regression Suite 1");
        Assert.assertEquals(5, 10);
    }
    

    @Test
    public void testPrintHelloWorld2() {
        System.out.println("I belong to Regression Suite 2");
        Assert.assertEquals(5, 10);
    }
    @Test
    public void testPrintHelloWorld3() {
        System.out.println("I belong to Regression Suite 3");
        Assert.assertEquals(5, 10);
    }
}
