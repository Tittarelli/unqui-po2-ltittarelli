package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoHipotecarioTest {

	SolicitudDeCredito solicitudDeCredito;
	Cliente cliente;
	Propiedad propiedad;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Leandro", "Tittarelli", "Roberto Arlt 3549", LocalDate.of(1997, 3, 10), 100000);
		propiedad = new Propiedad("Casa", "San Martin 399", 100000);
	}

	@Test
	void testSolicitudAceptable() {
		solicitudDeCredito = new SolicitudDeCreditoHipotecario(cliente, 50000, 60, propiedad);
		assertTrue(solicitudDeCredito.esAceptable());
	}
	
	@Test
	void testSolicitudNoAceptable() {
		solicitudDeCredito = new SolicitudDeCreditoHipotecario(cliente, 71000, 6, propiedad);
		assertFalse(solicitudDeCredito.esAceptable());	
	}
	
}
