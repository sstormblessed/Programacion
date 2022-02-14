package POO;

public class finanzas {
	
	//Atributo
	//Siempre dólares por euros
	double cambio;
	
	//Constructores
	finanzas() {
		this.cambio = 1.36;
	}
	
	finanzas(double c){
		this.cambio = c;
	}
	
	public double dolaresToEuro(double d) {
		return d / cambio;
	}
	
	public double eurosToDolares(double e) {
		return e * cambio;
	}

	@Override
	public String toString() {
		return "finanzas [cambio=" + cambio + "]";
	}
	
	
}
