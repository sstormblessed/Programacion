package POO;

public class peso {

	//atributos
	double cantidad;
	//String unidad; //Sobra este atributo??
	
	//constructor //sobra el segundo parámetro??
	peso(double c, String u){
		this.cantidad = pesoKilos(c, u);
		//this.unidad = "Kilos";
	}
	public double pesoKilos(double c, String u) {
		
		double normal = 0;

		switch(u) {

		case("Lingotes"):
			//pasar a kilos
			normal = 14.59 * c;
			break;
		case("Libras"):
			//pasar a kilos
			normal = 453 * c / 1000;
			break;
		case("Gramos"):
			//pasar a kilos
			normal = c / 1000;
			break;
		case("Onzas"):
			//pasar a kilos
			normal = 28.35 * c / 1000;
			break;
		case ("Peniques"):
			//pasar a kilos
			normal = 1.55 * c / 1000;
			break;
		case ("Quintales"):
			//pasar a kilos
			normal = 43.5 * c;
			break;
		case ("Kilos"):
			//pasar a kilos
			normal = c;
			break;

		default: System.out.println("Unidad no valida");
		}
		return normal;
}
	
	//metodos
	public void dimeLingotes() {
		System.out.println((cantidad/14.95) + " lingotes");
	}
	
	public void dimeLibras() {
		System.out.println((cantidad*1000/453) + " libras");
	}
	
	public void dimeGramos() {
		System.out.println((cantidad*1000) + " gramos");
	}
	
	public void dimeOnzas() {
		System.out.println((cantidad*1000/28.35) + " onzas");
	}
	
	public void dimePeniques( ) {
		System.out.println((cantidad*1000/1.55 )+ " peniques");
	}
	
	public void dimeQuintales() {
		System.out.println((cantidad/43.5) + " quintales");
	}
	
	@Override
	public String toString() {
		return "peso [cantidad=" + cantidad + "]";
	}
	
}
