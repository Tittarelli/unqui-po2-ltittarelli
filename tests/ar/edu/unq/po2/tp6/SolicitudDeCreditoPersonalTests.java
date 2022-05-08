package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoPersonalTests {
	
	SolicitudDeCredito solicitudDeCredito;
	Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Leandro", "Tittarelli", "Roberto Arlt 3549", LocalDate.of(1997, 3, 10), 100000);
	}

	@Test
	void testSolicitudAceptable() {
		solicitudDeCredito = new SolicitudDeCreditoPersonal(cliente, 50000, 60);
		assertTrue(solicitudDeCredito.esAceptable());
	}
	
	@Test
	void testSolicitudNoAceptable() {
		solicitudDeCredito = new SolicitudDeCreditoPersonal(cliente, 1000000, 6);
		assertFalse(solicitudDeCredito.esAceptable());
	}

}
