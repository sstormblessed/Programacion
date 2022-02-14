package POO;

import java.util.Scanner;

public class testConsumo {

	public static void main(String[] args) {
		double k, l, v, p;
		
		Scanner es = new Scanner(System.in);
		
		System.out.println("Introduce los datos del viaje: ");
		System.out.println("Kilómetros recorridos (km): ");
		k = es.nextDouble();
		System.out.println("Litros de combustible consumidos (l): ");
		l = es.nextDouble();
		System.out.println("Velocidad media (km/h): ");
		v = es.nextDouble();
		System.out.println("Coste del combustible (€): ");
		p = es.nextDouble();
		
		consumo viaje1 = new consumo(k, l, v, p);
		System.out.println(viaje1.toString());
		System.out.println("Información del viaje:");
		System.out.println(viaje1.dameInfo());
	
		es.close();
	}
}
