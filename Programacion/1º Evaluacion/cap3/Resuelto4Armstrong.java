package resueltos;

import java.util.Scanner;

/*
 * 4. Realiza un m�todo que, dado un n�mero de tres cifras, averig�e si es un n�mero Armstrong. Un n�mero es
Armstrong cuando la suma de cada uno de los n�meros que lo componen elevado al n�mero de d�gitos de dicho
n�mero da como resultado el propio n�mero. Como esta definici�n es algo compleja, con la siguiente imagen se ver�
m�s claro qu� es un n�mero Armstrong:
1 5 3 = 1 al cubo + 5 al cubo +3 al cubo
         1        +   125     +  27
         153
 */
public class Resuelto4Armstrong {

	static int c, d, u;
	static int n = 0;

	public static void troceaNumero() {
		int aux=n;  //VARIABLE ES MUY LOCAL
		while (aux > 0) {
			if (aux >= 100) {
				u = n % 10;
			} else if (aux >= 10) {
				d = aux % 10;
			} else {
				c = aux % 10;
			}
			aux = aux / 10;
		}
	}

	public static int calculaPotencia() {
		return (int) (Math.pow(u, 3) + Math.pow(d, 3) + Math.pow(c, 3));
	}

	public static void muestraSalida() {
		if (calculaPotencia() == n)
			System.out.println("SI ES " + n + " un numero Armstrogn");
		else
			System.out.println("NO ES " + n + " un numero Armstrogn");
	}

	public static void pideNumero() {
		// entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce numero: SOLO TRES CIFRAS ");
		n = sc.nextInt();
	}

	public static void main(String[] args) {
		// 1 - separar el numero que se introduce en sus digitos
		// 2- elvar cada digito a la potencia que toque.
		// 3- sumar los resultados parciales.
		int r=0;
		int sum=0;
		// int numero = 0;
		// int calculo = 0;
		pideNumero();
		// algoritmo
		//troceaNumero();
		//calculaPotencia();

		// salida
		muestraSalida();
	//---------------------------------------------------------	
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if (sum == n)
			System.out.println("SI ES " + n + " un numero Armstrogn");
		else
			System.out.println("NO ES " + n + " un numero Armstrogn");
		System.out.println("Suma: "+sum);

	}
}
