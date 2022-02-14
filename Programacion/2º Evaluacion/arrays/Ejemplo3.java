package arrays;

import java.util.Arrays;
import java.util.Scanner;

//System.out.println("Cantidad de datos conocida");
public class Ejemplo3 {

	// Se leerán 10 valores.
	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe " + NUM_VALORES + " enteros. Se puede hacer en diferentes líneas.");
		// Se leen exactamente NUM_VALORES valores.
		int contador = 0;

		int [] lectura = new int[10];
		while (contador < NUM_VALORES) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextInt()) {
				
				lectura[contador]=lector.nextInt();
				//int valor = lector.nextInt();
				System.out.println("Valor " + contador + " leído: " + lectura[contador]);
				contador++;
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				// No se avanza tampoco el contador.
				lector.next();
			}
		}
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído " + NUM_VALORES + " valores.");
	
		lector.close();
	
	System.out.println(   Arrays.toString(lectura)   );
	}
}