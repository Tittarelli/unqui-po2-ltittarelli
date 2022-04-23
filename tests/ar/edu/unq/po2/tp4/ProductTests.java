package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTests {
	
	private Product rice;
	private Product wine; 
	
	@BeforeEach
	void setUp() throws Exception {
		rice = Product.createUnderFreezingPricesProgram("Rice", 18.9);
		wine = Product.create("Wine", 55);
	}
	
	@Test
	void testGettingProperties() {
		assertEquals("Rice", rice.name());
		assertTrue(rice.isFromFreezingPricesProgram());
		assertFalse(wine.isFromFreezingPricesProgram());
	}

	@Test
	void testIncreasePRrice() {
		assertEquals(18.9, rice.price());
		rice.increasePrice(1.5);
		assertEquals(20.4, rice.price());
	}

}
