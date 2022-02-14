package POO;

import java.util.Scanner;

public class rebajas {

	public static double descubrePorcentaje(double original, double actual) {
		return (original - actual) * 100 / original; 
	}
	
	public static double descubreOriginal(double actual, double porcentaje) {
		return actual / (1 - (porcentaje / 100));
	}
	
	public static double descubreActual(double original, double porcentaje) {
		return original - ((porcentaje / 100) * original);
	}
	
	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);
		double ori = 0, por = 0, act = 0;
		
		/*	//ent
		System.out.println("precio original= ");
		ori=esc.nextDouble();
		System.out.println("precio actual= ");
		act=esc.nextDouble();
		//alg
		por=descubrePorcentaje(ori, act);
		//s/+l
		System.out.println("porcentaje: "+por); */
		
	/*	System.out.println("precio actual= ");
		act=esc.nextDouble();
		System.out.println("porcentaje= "); 
		por=esc.nextDouble();
		
		ori=descubreOriginal(act, por);
		System.out.println("PRECIO ORIGINAL: "+ori); */
		
		System.out.println("Precio original: ");
		ori = esc.nextDouble();
		System.out.println("Porcentaje: "); 
		por = esc.nextDouble();
		
		act = descubreActual(ori, por);
		System.out.println("Precio actual: " + act);
		
		esc.close();
	}

}
