package telran.recursion.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static telran.recursion.LineRecursion.*
;class RecursionTest {
int count = 0;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void factorialTest() {
		assertEquals(24, factorial(4));
	}
	@Test
	void powTest() {
		assertEquals(1000, pow(10, 3));
		assertEquals(-1000, pow(-10, 3));
		assertEquals(100,pow(-10, 2));
	}
	@Test
	void sumTest() {
		int ar[] = {1, 2, 3, 4};
		assertEquals(10, sum(ar));
	}
	
	@Test
	void squareTest() {
		assertEquals(16, square(4));
		assertEquals(81, square(9));
		assertEquals(625, square(25));
		assertEquals(-625, square(-25));
	}
	
//	private void f() {
//		
//		if(Math.random() < 0.99) {
//			f();
//			count++;
//		}
//		
//		
//	}

}
