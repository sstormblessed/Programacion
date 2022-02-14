package repaso;

import java.util.Scanner;

/*
 * Bucle do-while que termina cuando se introduce un n�mero impar.
 * Vamos a sumar todos y contar cuantos se han introducido
 * mayores a 6.
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int num = 0;
		int contador = 0;
		int suma = 0;

		Scanner esc = new Scanner(System.in);

		do {
			System.out.println("Introduce un n�mero:");
			num = esc.nextInt();

			if (num % 2 == 0) {
				suma += num;

				if (num > 6) {
					contador++;
				}
			}

		} while (num % 2 == 0);

		if(contador > 0) {
		System.out.println("Suma total: " + suma);
		System.out.println("se han introducido " + contador + " n�meros mayores a 6");
		}
		
		System.out.println("Ere un graciosillo t� eh");
		
		esc.close();
	}

}
