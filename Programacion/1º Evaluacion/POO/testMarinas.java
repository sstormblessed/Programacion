package POO;

import java.util.Scanner;

public class testMarinas {

	public static void main(String[] args) {
		Scanner es = new Scanner(System.in);
		double millas;
		
		System.out.println("Introduce millas: ");
		millas = es.nextDouble();
		marinas doro = new marinas(millas);
		System.out.println(doro.toString() + " millas");
		
		//Conversiones
		System.out.println("En metros " + doro.millasMetros());
		System.out.println("En kilómetros " + doro.millasKilometros());
		
		es.close();
	}
}
