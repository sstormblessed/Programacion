package repaso;

import java.util.Scanner;

/*
 * En el siguiente ejemplo se cuentan y se suman los n�meros
 * que se van introduciendo por teclado.
 * Para indicarle al programa que debe dejar de pedir n�meros,
 * el usuario debe introducir un n�mero negativo;
 * esa ser� la condici�n de salida del bucle.
 * Observa que el bucle se repite mientras el n�mero introducido
 * sea mayor o igual que cero.
 * AL ACABAR MOSTRAR EL N�MERO DE INTRODUCIDOS
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

			System.out.println("Introduce un n�mero:");
			num = esc.nextInt();

			if (num >= 0) {
				suma += num;

				contador++;
			}
		}

		System.out.println("N�meros introducidos: " + contador);
		System.out.println("Suma total: " + suma);
		System.out.println("Media: " + (suma / contador));

		esc.close();

	}

}
