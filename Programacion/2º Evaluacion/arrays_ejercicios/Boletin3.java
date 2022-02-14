package arrays_ejercicios;

/*Leer 10 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.*/

public class Boletin3 {

	public static void main(String[] args) {

		int[] array = { 1,3,0,-5,2,0,-4,-7,11,-2};
		int ceros=0, pos=0, neg=0;
		int sumapos=0, sumaneg=0;
		for (int i = 0; i < array.length; i++) {
		
			if(array[i]>0) {
				pos++;
				sumapos+=array[i];
				}	
			else if(array[i]==0) {
				ceros++;
				}
			else {	
				neg++;
				sumaneg+=array[i];
		    }
		  }//fin del analisis

		/*resultados*/
		System.out.println("media positivos: "+ ( (float) sumapos/pos) );
		System.out.println("media negativos: "+ ( (float) sumaneg/neg) );
		System.out.println("numero de ceros: "+ ceros);
	}
}