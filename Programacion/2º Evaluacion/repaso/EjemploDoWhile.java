package repaso;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {

		int num = 0;
		int contador = 0;
		int suma = 0;

		Scanner esc = new Scanner(System.in);

		do {
			System.out.println("Introduce un número:");
			num = esc.nextInt();

			if (num >= 0) {
				suma += num;

				contador++;
			}
		} while(num >= 0);
		
		if(contador > 0) {
		System.out.println("Números introducidos: " + contador);
		System.out.println("Suma total: " + suma);
		System.out.println("Media: " + (suma / contador));
		}else {
			System.out.println("Eres un graciosín tú eh");
		}
		
		esc.close();
	}
	
}
