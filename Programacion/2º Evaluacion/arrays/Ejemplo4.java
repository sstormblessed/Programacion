package arrays;

import java.util.Arrays;
import java.util.Scanner;

//3.1.2 Cantidad de datos desconocida (ARRAY AMPLIO) MOSTRARLO
public class Ejemplo4 {

	public static final int END = -1;

	public static void main(String[] args) {
		
		int[] lectura = new int[20];
		
		Scanner esc = new Scanner(System.in);
		System.out.print("Escribe diferentes valores enteros.");
		System.out.println("Después del último valor escribe un" + END);
		// semaforo de encontrar la marca
		boolean marca = false;
		int contador=0;
		
		while (!marca) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (esc.hasNextInt()) {
				int valor = esc.nextInt();
				
				// Es la marca de fin?

				if (valor == END) {
					// Sí lo es.
					marca = true;
				} else {
					// No. Es un valor que debe ser tratado.
					lectura[contador]=valor;
					System.out.println("Valor leído: " + lectura[contador]);
					contador++;
				}
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				esc.next();
			}
		}
		// Los valores que sobren en la última línea escrita se descartan.
		esc.nextLine();
		System.out.println("Ya se han leído todos los valores.");
		
		System.out.println(Arrays.toString(lectura));
		
		esc.close();
	}

}