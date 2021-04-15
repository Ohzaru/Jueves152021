package com.dam1d.ejer_junit_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MiClaseTest {

	@Test
	void testEncripta() {
		MiClase encriptado = new MiClase("Mi mamá");
		String frase = encriptado.encripta();
		assertEquals("Qm$qeqå" , frase, "No encripta bien");
	}
}
