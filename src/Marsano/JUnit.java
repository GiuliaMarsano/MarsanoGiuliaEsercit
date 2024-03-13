package Marsano;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit {
	
	@Test
	void test() {
		//fail("Not yet implemented");
		
		Trapezio t = new Trapezio();
		assertEquals(2.5, t.area(3,2,1)); //sintetico
	}
	
	@Test
	void test1() {
		//fail("Not yet implemented");
		
		Trapezio t = new Trapezio();
		assertEquals(27.5, t.area(6,5,5)); //sintetico
	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
		
		Trapezio t = new Trapezio();
		assertEquals(18.5, t.area(32,5,1)); //sintetico
	}

}