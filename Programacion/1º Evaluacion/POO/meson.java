package POO;

import java.util.Scanner;

/*El restaurante mejicano de Israel cuya especialidad son las papas
 *con chocos nos pide dise�ar un m�todo con el que se pueda saber
 *cu�ntos clientes pueden atender con la materia prima que tienen
 *en el almac�n. 
 *El m�todo recibe la cantidad de papas y chocos en kilos y
 *devuelve el n�mero de clientes que puede atender el restaurante
 *teniendo en cuenta que por cada tres personas, 
 *Israel utiliza un kilo de papas y medio de chocos.
 */
public class meson {

	static double papas;
	static double chocos;

	public static int dimeCuantos(double p, double c) {
		   int cont=0;
		   //condicion para hacer un guiso para tres comensales
		   while(p>=1  && c>=0.5)     {
					p=p-1;
					c=c-0.5;
					cont=cont+3;
				    }; //fin while
				    System.out.println("patatas quedan: "+p);
				    System.out.println("chocos quedan: "+c);
			return cont;
	}
		
	public static void dimeAlmacen() {
		Scanner es = new Scanner(System.in);
		System.out.println("kg papas: ");
		papas = es.nextDouble();
		System.out.println("kg chocos: ");
		chocos = es.nextDouble();
		
		es.close();
	}

	public static void main(String[] args) {

		do {
			dimeAlmacen();
			System.out.println("comensales: " + dimeCuantos(papas, chocos));
		} while (true);
	}
}