package arrays;

import java.util.Scanner;

public class Ejemplo1B {
	
	//palabraClaveTipo [] identificadorVariable = {valor1, valor2, ..., valorN};
	
		//palabraClaveTipo [] identificadorVariable = new palabraClaveTipo[tamaño];
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner esc=new Scanner(System.in);
			//inicializacion
			int[] numeros= {1,2,3,4,5,6,7,8,9,0};
			
			for(int j=0;j<numeros.length;j++) {
				System.out.println("indice "+j+" valor "+numeros[j]);
			}
			
			char[] letras = new char[5];
			
			for(int k=0;k<5;k++) {
				System.out.println("introduce letra para el indice "+k);
				letras[k]=    esc.next().charAt(0);
				}
			
			for(int k=0;k<letras.length;k++) {
				System.out.println("indice "+k+" letra "+letras[k]);
			}
			
			System.out.println(  numeros.toString() ) ;
			System.out.println(  letras.toString() ) ;
			
			esc.close();
		}

}
