package Fibonacci.Fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JunitTest {
	
	//Testing the 1st term of Fibonacci using the recursive method 
	@Test
	public void testRecursive_1() {
	
		int testIndex = 1;
		int expectedResult = 1; 
		
		assertEquals(expectedResult, Recursive.recursive(testIndex));
	}
	
	//Testing the 5th term of Fibonacci using the recursive method 
	@Test
	public void testRecursive_5() {
	
		int testIndex = 5;
		int expectedResult = 5; 
		
		assertEquals(expectedResult, Recursive.recursive(testIndex));
	}
	
	//Testing the 10th term of Fibonacci using the recursive method 
	@Test
	public void testRecursive_10() {
	
		int testIndex = 10;
		int expectedResult = 55; 
		
		assertEquals(expectedResult, Recursive.recursive(testIndex));
	}
}
