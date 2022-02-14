package conversorFrases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadorTest {

	@Test
	void testsuma() {
		Calculador suma = new Calculador();
		float res = suma.suma(3, 2);
		assertEquals(5, res);
	}
	
	@Test
	void testdividir() {
		Calculador division = new Calculador();
		float res = division.division(10, 2);
		assertEquals(5, res);
	}
	
	@Test
	void testDividirDecimales() {
		Calculador division = new Calculador();
		float res = division.division(10.6f, 3.2f);
		assertEquals(3.3125, res, 0.001);
	}
	
	@Test
	void testDividirCero() {
		Calculador division = new Calculador();
		float res = division.division(5, 0);
		assertEquals(Float.isFinite(res), true);
	}
}
