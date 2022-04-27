package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiceTests {
	
	ServiceInvoice service;

	@BeforeEach
	void setUp() throws Exception {
	service = new ServiceInvoice(new ConcreteAgency(), 15.3, 10);
	}

	@Test
	void testAmountToPay() {
		assertEquals(153, service.amount());
	}

}
