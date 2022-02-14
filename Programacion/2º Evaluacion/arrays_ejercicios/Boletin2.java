package arrays_ejercicios;

import java.util.Scanner;

public class Boletin2 {

	/*
	 * Leer 5 números y mostrarlos en orden inverso al introducido.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		/* pedir numeros */
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce el indice " + i);
			array[i] = sc.nextInt();
		}

		/* mostrarlos */
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(" " + array[i]);
		}
	}
}