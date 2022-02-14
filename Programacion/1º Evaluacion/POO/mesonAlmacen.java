package POO;

import java.util.Scanner;

/* Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del
restaurante. Implementa los siguientes m�todos:
public void addChocos(int x). A�ade x kilos de chocos a los ya existentes.
public void addPapas(int x). A�ade x kilos de papas a los ya existentes.
public int getComensales(). Devuelve el n�mero de clientes que puede atender el restaurante (este es el
m�todo anterior).
public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almac�n.
public void showPapas(). A�ade Muestra por pantalla los kilos de papas que hay en el almac�n. */

public class mesonAlmacen {

	//mi almacen
	static double papas, chocos;
	
	public static int getComensales() {
		   int cont=0;
		   while(papas >= 1  && chocos >= 0.5)     {
					papas = papas - 1;
					chocos = chocos - 0.5;
					cont = cont + 3;
				    }; //fin while
				    System.out.println("patatas quedan: " + papas);
				    System.out.println("chocos quedan: " + chocos);
			return cont;
	}
	
	public static void showPapas() {
		System.out.println("Patatas: " + papas);
	}
	public static void showChocos() {
		System.out.println("Chocos: " + chocos);
	}
	
	public static void showAlmacen() {
		System.out.println("EXISTENCIAS ALMACEN");
		showPapas();
		showChocos();
	}
	
	public static void actualizaAlmacen() {
		Scanner es = new Scanner(System.in);
		
		System.out.println("A�adir patatas (Kg): ");
		papas = es.nextDouble();
		System.out.println("A�adir chocos (Kg): ");
		chocos = es.nextDouble();
		
		es.close();
	}
	
	public static void menu() {
		//Repetir mientras Israel quiera
		do {
			/* mostrar almacen
			 * ir a comprar
			 * mostrar almacen
			 * dar de comer
			 * mostrar almacen */
			showAlmacen();
			actualizaAlmacen();
			showAlmacen();
			getComensales();
			showAlmacen();
			
		} while(true);
			
	}
	
	public static void main(String[] args) {
		menu();
	}
}
