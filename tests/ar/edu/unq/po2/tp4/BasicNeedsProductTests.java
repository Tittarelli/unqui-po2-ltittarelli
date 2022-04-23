package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasicNeedsProductTests {
	
	private Product milk;

	@BeforeEach
	void setUp() throws Exception {
		milk = BasicNeedsProduct.createDiscounting("Milk", 8, 10);
	}

	@Test
	void testPrice() {
		assertEquals(7.2, milk.price());
	}

}
