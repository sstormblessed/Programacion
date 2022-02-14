package cap2;

/*
 7. Crea una clase con un m�todo millasAMetros() que toma como par�metro de entrada un valor en millas marinas
y las convierte a metros.
Una vez tengas este m�todo escribe otro millasAKilometros() que realice la misma conversi�n, pero esta vez
exprese el resultado en kil�metros.
Nota: 1 milla marina equivale a 1852 metros.
 */

import java.util.Scanner;

public class marinas {

	// atributos
	double cantidad;

	// constructor
	marinas(double cantidad) {
		this.cantidad = cantidad;
	}

	public void setCantidad(double cantiad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "marinas [cantidad=" + cantidad + "]";
	}

	double millasAMetros() {
		return cantidad * 1852;
	}

	double millasAKilometros() {
		return millasAMetros()/1000;
	}
}
