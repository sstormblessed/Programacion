
package cap3;

import java.util.Scanner;

/*
 * 9. (Ejercicio de dificultad alta) Realiza una clase minumero con un m�todo esOmirp que diga si un n�mero es Omirp
o no. Un n�mero es Omirp si es un n�mero primo y, adem�s, al invertir sus d�gitos da otro n�mero primo. Por
ejemplo: 7951 y 1597.
 */

import java.util.Scanner;

//Ahora muestra por pantalla todos los numeros entre el 1 y el 1000
public class propuesto9Omirp {
	

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int i = 2;
		while (i < numero && primo) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		};
		return primo;
	}

	public static void listarPrimos(int n) {
		for (int i = 1; i <= n; i++) {
			if (esPrimo(i))
				System.out.println(i);

		}
	}

	public static void main(String[] args) {
//TODO Auto-generated method stub
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("numero a comprobar: ");
		aux = sc.nextInt();
		System.out.println(esPrimo(aux));

		System.out.println("Primos a listar: ");
		aux = sc.nextInt();
		listarPrimos(aux);
		sc.close();
	};

}