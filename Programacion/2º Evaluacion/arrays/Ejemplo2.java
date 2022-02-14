package arrays;

import java.util.Scanner;

public class Ejemplo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ejemplo de entrada secuencial
		Scanner esc= new Scanner(System.in);
		int[] lectura;
		int tam=3;
		
		lectura = new int[tam];
		
		for( int j=0;j<lectura.length;j++) {
			
			System.out.println("introduce valor "+j+": ");
			lectura[j]=esc.nextInt();
		}
		for(int i=0;i<lectura.length;i++) {
			System.out.println("indice es: "+ i+ " valor almacenado: "+lectura[i]);
		}
		System.out.println("Cantidad de datos conocida");
		
		esc.close();
		
	}
}
