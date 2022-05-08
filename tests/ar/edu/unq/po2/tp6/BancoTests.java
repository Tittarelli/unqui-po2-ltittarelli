package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTests {
	
	Banco banco; 
	Cliente cliente;
	Propiedad propiedad;
	SolicitudDeCredito solicitudAceptable;
	SolicitudDeCredito solicitudNoAceptable;
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		cliente = new Cliente("Leandro", "Tittarelli", "Roberto Arlt 3549", LocalDate.of(1997, 3, 10), 50000);
		solicitudAceptable = new SolicitudDeCreditoPersonal(cliente, 13299,12);
		propiedad = new Propiedad("Casa", "Lituania 23", 30000);
		solicitudNoAceptable = new SolicitudDeCreditoHipotecario(cliente, 100000, 6, propiedad);
	}

	@Test
	void testMontoADesembolsar() {
		banco.registrarSolicitud(solicitudAceptable);
		banco.registrarSolicitud(solicitudNoAceptable);
		assertEquals(13299, banco.totalADesembolsar());
	}

}
