package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermarketTests {
	
	private Product rice;
	private Product detergent;
	private Supermarket supermarket;

	@BeforeEach
	void setUp() throws Exception {
		rice = Product.createUnderFreezingPricesProgram("Rice", 18.9);
		detergent = Product.create("Deterget", 75);
		supermarket = new Supermarket("Lo de Tito", "Av. Zubeldía 801");
	}

	@Test
	void testProductsAmount() {
		assertEquals(0, supermarket.productsSize());
		supermarket.addProduct(rice);
		supermarket.addProduct(detergent);
		assertEquals(2, supermarket.productsSize());
	}
	
	@Test
	void testTotalPrices() {
		assertEquals(0, supermarket.totalPrice());
		supermarket.addProduct(rice);
		supermarket.addProduct(detergent);
		assertEquals(93.9, supermarket.totalPrice());
	}

}
