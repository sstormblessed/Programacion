package arrays_ejercicios;

/* Leer los datos correspondientes a dos tablas de 12
elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
la B, etc */

public class Boletin6 {

	public static void main(String[] args) {
		int[] arrayA = { 1,2,3,4,5,6,7,8,9,10,11,12 };
		int[] arrayB = { 51,52,53,54,55,56,57,58,59,60,61,62 };
		int[] junto = new int[24];
		
		for(int i = 0, j = 0; i < junto.length ; i = i + 6, j = j + 3) {
			
			junto[i] = arrayA[j];
			junto[i+1] = arrayA[j+1];
			junto[i+2] = arrayA[j+2];
			junto[i+3] = arrayB[j];
			junto[i+4] = arrayB[j+1];
			junto[i+5] = arrayB[j+2];
		}
		
		for (int k = 0; k < junto.length; k++) {
			System.out.println(junto[k]);
		}
	}
}
