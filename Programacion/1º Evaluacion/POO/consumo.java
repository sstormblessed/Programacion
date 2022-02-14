package POO;

import java.util.Scanner;

public class consumo {

	//Atributos
	double kms; 	//Kil�metros recorridos.
	double litros; 	//Litros de combustible consumido.
	double vmed;	//Velocidad media.
	double pgas;	//Precio de la gasolina
	
	//Constructores
	public consumo(consumo cen) {
		this.kms = cen.kms;
		this.litros = cen.litros;
		this.vmed = cen.vmed;
		this.pgas = cen.pgas;
	}
	
	public consumo(double kms, double litros, double vmed, double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}

	//M�todos
	//M�TODO DE PETICI�N DE INFO DE K, P, L, V
	@SuppressWarnings("resource")
	public static consumo pideInfo() {
		consumo c;
		double k, l, v, p;
		Scanner es = new Scanner(System.in);
		
		System.out.println("Introduce los datos del viaje: ");
		System.out.println("Kil�metros recorridos (km): ");
		k = es.nextDouble();
		System.out.println("Litros de combustible consumidos (l): ");
		l = es.nextDouble();
		System.out.println("Velocidad media (km/h): ");
		v = es.nextDouble();
		System.out.println("Coste del combustible (�): ");
		p = es.nextDouble();
		System.out.println();
		c = new consumo(k, l, v, p);
		return c;
	}
	
	public String dameInfo() {
		return "[ getTiempo()= " + getTiempo() + ", consumoMedio()= " + consumoMedio() +
				", consumoEuros()= " + consumoEuros() + "]";
	}

	public double getTiempo() { //Indicar� el tiempo empleado en realizar un viaje
		return kms / vmed; //360(km) / 120(km/h) = 3h
	}
	
	public double consumoMedio() { //Consumo medio del veh�culo en litros por kil�metro
		return (litros * 100) / kms; //Litros / (km/100)
	}
	
	public double consumoEuros() { //Gasto medio del veh�culo en euros cada 100 kil�metros
		return pgas * consumoMedio();
	}
	
	@Override
	public String toString() {
		return "consumo [kms=" + kms + ", litros=" + litros + ", vmed=" + vmed + ", pgas=" + pgas + "]";
	}
	
}
