package POO;

	/* Crea una clase con un m�todo millasMetros() que toma como par�metro
	 * de entrada un valor en millas marinas y las convierte a metros.
	 * Una vez tengas este m�todo escribe otro millasKilometros() que realice la misma conversi�n,
	 * pero esta vez exprese el resultado en kil�metros.
	 * Nota: 1 milla equivale a 1852 metros.
	 */

public class marinas {

	double cantidad; //Siempre en millas
	
	marinas(double c){
		this.cantidad = c;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "marinas [cantidad=" + cantidad + "]";
	}
	
	double millasMetros() {
		return cantidad * 1852;
	}
	
	double millasKilometros() {
		return millasMetros() / 1000;
	}
	
	
}
