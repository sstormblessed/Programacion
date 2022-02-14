package repaso;

import java.util.Scanner;

/*
 * En el siguiente ejemplo se cuentan y se suman los números
 * que se van introduciendo por teclado.
 * Para indicarle al programa que debe dejar de pedir números,
 * el usuario debe introducir un número negativo;
 * esa será la condición de salida del bucle.
 * Observa que el bucle se repite mientras el número introducido
 * sea mayor o igual que cero.
 * AL ACABAR MOSTRAR EL NÚMERO DE INTRODUCIDOS
 * LA SUMA
 * Y LA MEDIA
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int num = 0;
		int contador = 0;
		int suma = 0;

		Scanner esc = new Scanner(System.in);

		while (num >= 0) {

			System.out.println("Introduce un número:");
			num = esc.nextInt();

			if (num >= 0) {
				suma += num;

				contador++;
			}
		}

		System.out.println("Números introducidos: " + contador);
		System.out.println("Suma total: " + suma);
		System.out.println("Media: " + (suma / contador));

		esc.close();

	}

}
