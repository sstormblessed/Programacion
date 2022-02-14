package arrays_ejercicios;

import java.util.Scanner;

//Programa que lee una secuencia de valores reales, de longitud conocida.
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
//Lee la longitud de la secuencia. Comprueba todos los errores.
		int nombreValores = 0;
		while (nombreValores <= 0) {
			System.out.print("�Cu�ntas notas quieres introducir?");

			if (lector.hasNextInt()) {
				nombreValores = lector.nextInt();
			} else {
//Si no es entero, se lee y se ignora.
				lector.next();
			}
		}
//Si se han entrado m�s valores, se ignoran. S�lo se necesita una.
		lector.nextLine();
		System.out.println("Se leer�n " + nombreValores + " valores reales.");
		System.out.println("Puedes escribir varios valores en una sola l�nea, separados por espacios.");
//Los guardaremos en un array. Ya conocemos el tama�o.
		float[] arrayNotas = new float[nombreValores];
//Hay que leer tantos reales como el tama�o del array.
//Estructura de repetici�n con contador.
		int index = 0;
		while (index < arrayNotas.length) {
			if (lector.hasNextFloat()) {
//Se ha le�do una nota, pero es v�lida (entre 0 y 10)?
				float nota = lector.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					arrayNotas[index] = nota;
					index++;
				}
//Si no es v�lida, la ignoramos. No se asigna ninguna parte.
			} else {
//Si no era un real, simplemente leemos el valor como una cadena de texto

//pero no hacemos nada. Se pierde.
				lector.next();
			}
		}
//Ignoramos los valores sobrantes de la �ltima l�nea.
		lector.nextLine();
		System.out.println("La secuencia le�da es: ");
		for (int i = 0; i < arrayNotas.length; i++) {
			System.out.println(arrayNotas[i]);
		}
		
		lector.close();
	}
}