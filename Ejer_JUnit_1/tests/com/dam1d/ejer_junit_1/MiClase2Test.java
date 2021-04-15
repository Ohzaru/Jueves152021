package com.dam1d.ejer_junit_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiClase2Test {

	@Test
	void testDesencripta() {
		MiClase2 desencriptado  = new MiClase2("Qm$qeqå");
		String frase = desencriptado.desencripta();
		assertEquals("Mi mamá" , frase, "No encripta bien");
	}
}
