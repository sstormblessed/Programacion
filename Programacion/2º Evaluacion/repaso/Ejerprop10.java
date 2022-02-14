package repaso;

import java.util.Scanner;

/*Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. 
Si no acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la 
combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha 
abierto satisfactoriamente�.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/
public class Ejerprop10 {

	final static int COMBI = generarCombinacion();

	public static int generarCombinacion() {
		return  (int)  ( 1+ Math.random()*9999 );
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner esc = new Scanner(System.in);
		int numero = 0;
		int intentos = 1;
		boolean acertado = false;

		do {
			System.out.println("introduce numero: ");
			numero = esc.nextInt();

			if (numero == COMBI) {
				acertado = true;
			} else if (numero > COMBI) {
				System.out.println("menos menos");
			} else {
				System.out.println("mas mas");
			}

			intentos++;
		} while (!acertado);
//((intentos <= 10) && (!acertado))
		//if (acertado)
			System.out.println("has acertado en "+intentos);
		//else
			//System.out.println("se acabo");
			
		esc.close();

	}
}