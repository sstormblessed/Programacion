package POO;

import java.util.Scanner;

public class testPeso {

	public static void main(String[] args) {
		double cant;
		String un;
		
		Scanner es = new Scanner(System.in);
		System.out.println("Cantidad: ");
		cant = es.nextDouble();
		System.out.println("Unidad: ");
		un = es.next();
		
		//Crear un objeto de la clase
		peso pluma = new peso(cant, un);
		
		//INFO
		System.out.println("Objeto tiene la cantidad en kilos: ");
		System.out.println(pluma.toString());
		
		System.out.println("Conversiones: ");
		pluma.dimeLingotes();
		pluma.dimeLibras();
		pluma.dimeGramos();
		pluma.dimeOnzas();
		pluma.dimePeniques();
		pluma.dimeQuintales();
		
	es.close();
	}
	
}
