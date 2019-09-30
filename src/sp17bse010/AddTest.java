package sp17bse010;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTest {
	@Test
	public void isPositiveNumber() {
		int result = Main.addTwoInteger(10, 20);	
		assertEquals(30, result);	
	}	
	@Test
	public void greaterThanB() {
		int result = Main.addTwoInteger(10, 2);	
		assertEquals(12, result);	
	}
	@Test
	public void Test() {
		int result = Main.addTwoInteger(2, 18);	
		assertEquals(20, result);	
	}
	@Test
	public void isNegativeNumber() {
		int result = Main.addTwoInteger(-10, -20);
		assertEquals(-30, result);	
	}	
	@Test
	public void isOppositeSign() {
		int result = Main.addTwoInteger(-10, 10);	
		assertEquals(0, result);	
	}
	@Test
	public void isOppositeSign1() {
		int result = Main.addTwoInteger(10, -10);	
		assertEquals(0, result);	
	}
	@Test
	public void Test1() {
		int result = Main.addTwoInteger(10, -2);	
		assertEquals(8, result);	
	}
	@Test
	public void Test3() {
		int result = Main.addTwoInteger(-10, -2);	
		assertEquals(-12, result);	
	}
	@Test
	public void Test2() {
		int result = Main.addTwoInteger(-20, 10);	
		assertEquals(-10, result);	
	}
	@Test
	public void bothZero() {
		int result = Main.addTwoInteger(0, 0);	
		assertEquals(0, result);	
	}	
	
	@Test
	public void isMaxOF() {
		int result = Main.addTwoInteger(0, 2147483647);	
		assertEquals(0, result);	
	}
	@Test
	public void isMaxOF1() {
		int result = Main.addTwoInteger(2147483647, 0);	
		assertEquals(0, result);	
	}
	@Test
	public void isMinOF() {
		int result = Main.addTwoInteger(0, -2147483648);	
		assertEquals(0, result);	
	}
}
