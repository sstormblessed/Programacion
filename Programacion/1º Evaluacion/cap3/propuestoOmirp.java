package cap3;

import java.util.Scanner;

/*9. (Ejercicio de dificultad alta) Realiza una clase miNumero con un m�todo
 *esOmirp que diga si un n�mero es Omirp o no. Un n�mero es Omirp si es un
 *n�mero primo y, adem�s, al invertir sus d�gitos da otro n�mero primo.
 Por ejemplo: 7951 y 1597*/

//Listar por pantalla todos los n�meros primos entre 1 y 1000/
public class propuestoOmirp {
	
		public static void listarPrimos(int n) {
			for(int i=1;i<n;i++) {
				if(esPrimo(i))
					System.out.println(i);
			}
		}
	
		public static boolean esPrimo(int numero) {
			boolean primo=true;
			int i=2;
			
			while(i<numero && primo) {
				if(numero%i==0) {
					primo=false;
				}else {
					i++;
				}
			}
			
			return primo;
		}

		public static void main(String[] args) {
			Scanner esc=new Scanner(System.in);
			System.out.println("Introduce el n�mero que quieres comprobar:");
			int aux=esc.nextInt();
			
			System.out.println("El numero "+aux+" es primo? " +esPrimo(aux));
			
			System.out.println("Primos a listar:");
			aux=esc.nextInt();
			listarPrimos(aux);
		}
	
}
