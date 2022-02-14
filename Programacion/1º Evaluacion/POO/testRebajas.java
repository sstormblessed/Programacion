package POO;

import java.util.Scanner;

public class testRebajas {

	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);
		int res = 0;
		double actu = 0;
		double ori = 0;
		double por = 0;
		
	do {
		System.out.println("MENÚ REBAJAS");
		System.out.println();
		System.out.println("Pulsa 1 para Descubrir el Porcentaje de rebaja, ");
		System.out.println("pulsa 2 para Descubrir el valor Original, ");
		System.out.println("pulsa 3 para Descubrir el valor Actual ");
		System.out.println("o pulsa 0 para terminar:");
				res = esc.nextInt();
				
		if(res != 1 || res != 2 || res != 3 || res != 0) {
			System.out.println("ERROR Introduce una respuesta válida");
			}
		else {}
			if(res == 1) {
				System.out.println("Introduce el valor Original:");
				ori = esc.nextDouble();
				System.out.println("Introduce el valor Actual:");
				actu = esc.nextDouble();
				System.out.println("El porcentaje de rebaja es un " + rebajas.descubrePorcentaje(ori, actu) + "%");
				}
			else {
				if(res == 2) {
					System.out.println("Introduce el valor Actual:");
					actu = esc.nextDouble();
					System.out.println("Introduce el Porcentaje de rebaja:");
					por = esc.nextDouble();
					System.out.println("El valor previo a la rebaja es de " + rebajas.descubreOriginal(actu, por) + "€");
					}
				else {
					if(res == 3) {
						System.out.println("Introduce el valor Original:");
						ori = esc.nextDouble();
						System.out.println("Introduce el Porcentaje de rebaja:");
						por = esc.nextDouble();
						System.out.println("El valor despúes de la rebaja es de " + rebajas.descubreActual(ori, por) + "€");
						}
					}
				
		}
	} while(res != 0);
		if (res == 0) {
			System.out.println("SE ACABÓ MANIN");
			}
	esc.close();
	}
}
