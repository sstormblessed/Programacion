package arrays_ejercicios;

/*Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1o de A, el 1o de
B, el 2o de A, el 2o de B, etc.*/

public class Boletin5 {
	
	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3, 4, 5 };
		int[] arrayB = { 10, 9, 8, 7, 6 };
		int[] arrayC = { -1,-2,-3,-4,-5 };
		
		int triple = arrayA.length*3;
		int[] mezcla = new int[triple];
		
		//MEZCLAR
		for (int i = 0, j = 0; i < arrayA.length; i++, j = j + 3) {
			
			mezcla[j] = arrayA[i];
			mezcla[j+1] = arrayB[i];
			mezcla[j+2] = arrayC[i];
		}
		//MOSTRAR
		for (int k = 0; k < mezcla.length; k++) {
			System.out.println(mezcla[k]);
		}
	}
}