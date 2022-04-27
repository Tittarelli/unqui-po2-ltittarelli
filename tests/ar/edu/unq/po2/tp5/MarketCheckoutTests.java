package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarketCheckoutTests {

	MarketCheckout checkout;
	
	@BeforeEach
	void setUp() throws Exception {
	checkout = new MarketCheckout();
	}

	@Test
	void testRegisteringProduct() throws Exception{
		Chargeable rice = new Product("Rice", 10, 3);
		checkout.register(rice);
		assertEquals(10, checkout.totalAmount());
	}
	
	@Test
	void testAmountWithCooperativeProduct() throws Exception{
		Chargeable rice = new Product("Rice", 50, 1);
		Chargeable wine = new CooperativeProduct("Wine", 100, 1);
        checkout.register(wine);
        checkout.register(rice);
		assertEquals(140, checkout.totalAmount());

	}
	
	@Test
	void testRegisteringInvoices() throws Exception {
		Agency agency = new ConcreteAgency();
		Chargeable taxInvoice = new TaxInvoice(agency, 30.5);
		Chargeable serviceInvoice = new ServiceInvoice(agency, 5, 10);
		checkout.register(taxInvoice);
		checkout.register(serviceInvoice);
		assertEquals(80.5, checkout.totalAmount());
	}

}
