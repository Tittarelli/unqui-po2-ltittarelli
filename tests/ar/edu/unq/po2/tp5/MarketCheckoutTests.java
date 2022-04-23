package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarketCheckoutTests {

	MarketCheckout checkout;
	
	@BeforeEach
	void setUp() throws Exception {
	checkout = new MarketCheckout();
	}

	@Test
	void testStock() {
		Product rice = new Product("Rice", 10);
		checkout.increaseStock(rice, 5);
		assertEquals(5, checkout.stockOf(rice));
		checkout.increaseStock(rice, 4);
		assertEquals(9, checkout.stockOf(rice));
	}
	
	@Test
	void testRegisteringProduct() throws Exception {
		Product rice = new Product("Rice", 10);
		checkout.increaseStock(rice, 5);
		checkout.register(rice);
		assertEquals(4, checkout.stockOf(rice));
		assertEquals(10, checkout.totalAmount());
	}
	
	@Test
	void testCannotRegisterAProductWithoutStock() {

		  Exception thrown = Assertions.assertThrows(Exception.class, () -> {
		           checkout.register(new Product("Wine", 5));
		  });

		  Assertions.assertEquals("There is no stock for the requested product", thrown.getMessage());
		
	}
	
	@Test
	void testAmountWithCooperativeProduct() throws Exception {
		Product rice = new Product("Rice", 50);
		Product wine = new CooperativeProduct("Wine", 100);
		checkout.increaseStock(rice, 1);
		checkout.increaseStock(wine, 1);
        checkout.register(wine);
        checkout.register(rice);
		assertEquals(140, checkout.totalAmount());

	}

}
