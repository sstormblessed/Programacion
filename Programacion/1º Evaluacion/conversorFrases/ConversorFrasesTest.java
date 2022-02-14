package conversorFrases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorFrasesTest {

	@Test
	void testPasarMayusculas() {
		ConversorFrases conv = new ConversorFrases();
		String fraseMayus = conv.pasarMayusculas("Est�s bobo o qu�?");
		assertEquals("EST�S BOBO O QU�?", fraseMayus);
	}
	
	@Test
	void testPasarMayusculasCadenaVacia() {
		ConversorFrases conv = new ConversorFrases();
		String fraseMayus = conv.pasarMayusculas("");
		assertEquals("", fraseMayus);
	}
	@Test
	void testPasarMayusculasNull() {
		ConversorFrases conv = new ConversorFrases();
		String fraseMayus = conv.pasarMayusculas(null);
		assertEquals(null, fraseMayus);
	}

}
