package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTests {
	
	Cliente cliente;

	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Leandro", "Tittarelli", "Roberto Arlt 3549",LocalDate.of(1997, 3, 10),100000);
	}

	@Test
	void testSueldoNetoAnual() {
		assertEquals(1200000, cliente.sueldoNetoAnual());
	}
	
	@Test
	void testMenorA65aniosEn12Meses() {
		assertTrue(cliente.menorA65En(12)); // Extraño smalltalk :'( menorA: unaEdad en: unPlazoDeTiempo
	}

}
