package repaso;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=0;
		int b=0;
		
		System.out.println("Introduzca un n�mero");
		a=sc.nextInt();
		
		
		do {
			System.out.println("Qu� n�mero es?");
			b=sc.nextInt();
			if(b>a) {
				System.out.println("El n�mero es menor");
			}else if (b<a){
				System.out.println("El n�mero es mayor");
			}else {
				System.out.println("Has acertado");
			}
		}while (a!=b);
	}

}
