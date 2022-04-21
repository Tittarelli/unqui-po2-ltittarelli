package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperatorTests {
	
	MultiOperator multioperator;

	@BeforeEach
	void setUp() throws Exception {
		multioperator = new MultiOperator();
	}

	@Test
	void testSum() {
		assertEquals(9, multioperator.sum(Arrays.asList(2,3,4)));
	}
	
	@Test
	void testSumWithANegativeNumber() {
		assertEquals(1, multioperator.sum(Arrays.asList(2,-5,4)));
	}
	
	@Test
	void testSubstract() {
		assertEquals(-10, multioperator.substract(Arrays.asList(2,3,5)));
	}
	
	@Test
	void testProduct() {
		assertEquals(32, multioperator.product(Arrays.asList(2,2,2,4)));
	}

	@Test
	void testProductWithAZeroInTheFinal() {
		assertEquals(0, multioperator.product(Arrays.asList(52,25,444,0)));
	}
}
