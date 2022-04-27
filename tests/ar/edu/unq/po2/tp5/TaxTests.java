package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxTests {
	
	TaxInvoice tax;

	@BeforeEach
	void setUp() throws Exception {
		tax = new TaxInvoice(new ConcreteAgency(), 350);
	}

	@Test
	void testAmountToPay() {
		assertEquals(350, tax.amount());
	}

}
