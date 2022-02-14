package arrays;

import java.util.Scanner;

public class ChangeSize {

	public static final int INICIAL = 10;
	public static final int INCREMENTO = 5;

	public static void main(String[] args) {

		float[] notas = new float[INICIAL];
		// Hay un contador de posiciones en las que hay valores válidos.
		int elementos = 0;
		Scanner lector = new Scanner(System.in);

		System.out.print("Ir escribiendo notas (valores reales entre 0 y 10).");
		System.out.println("Puedes escribir varios en una sola línea, separados por espacios.");
		System.out.println("(Para terminar, escribe un -1)");

		// Si escribimos más valores, cambiamos el tamaño del array
		// y continuamos leyendo

		boolean fin = false;
		while (!fin) {
			if (lector.hasNextFloat()) {
				float nota = lector.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					if (elementos == notas.length) {
						System.out.println("Capacidad superada. Añadimos " + INCREMENTO + " posiciones...");
						float[] arrayNuevo = new float[notas.length + INCREMENTO];
						for (int i = 0; i < notas.length; i++) {
							arrayNuevo[i] = notas[i];
						}
						// REASIGNACIÓN DEL NOMBRE VIEJO AL ARRAY AMPLIADO
						notas = arrayNuevo;
					}
					notas[elementos] = nota;
					elementos++;
				} else if (nota == -1) {
					break;
				}
			} else {
				lector.next();
			}
		}
		lector.nextLine();
		System.out.println("En el array hay almacenados " + elementos + " elementos:");
		for (int i = 0; i < elementos; i++) {
			System.out.println(notas[i]);
		}

		lector.close();
	}
}
