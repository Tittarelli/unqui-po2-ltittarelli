package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTests {
	
	Propiedad propiedad;

	@BeforeEach
	void setUp() throws Exception {
	propiedad = new Propiedad("Departamento", "Av. Santa Fe 1355", 160000);
	}
	
	@Test
	void testNoSePuedeCrearUnaPropiedadConValorFiscalNegativo() {
		Exception exception = assertThrows(Exception.class, () -> {
			propiedad = new Propiedad("Casa", "Sarmiento 2333", -2);
		});

		assertEquals(exception.getMessage(), "El valor fiscal no puede ser negativo");
	}

	@Test
	void testSePuedeObtenerElValorFiscal() {
		assertEquals(160000, propiedad.valorFiscal());
	}

}
