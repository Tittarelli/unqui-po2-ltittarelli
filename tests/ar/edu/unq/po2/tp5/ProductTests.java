package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTests {

	Product product;

	@Test
	void testCannotCreateAProductWithoutStock() throws Exception {
		

		Exception exception = assertThrows(Exception.class, () -> {
			product = new Product("Rice", 10, -2);
		});

		assertEquals(exception.getMessage(), "The stock cannot be negative");

	}


	@Test
	void testCannotRegisterAProductWichIsOutOfStock() throws Exception {
		product = new Product("Rice", 10, 0);

		Exception exception = assertThrows(Exception.class, () -> {
			product.register();
		});

		assertEquals(exception.getMessage(), "There is no stock of Rice");

	}

}
