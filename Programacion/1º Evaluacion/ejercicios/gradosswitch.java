package ejercicios;

import java.util.Scanner;

public class gradosswitch {

	// �F = (�C � 1,8) + 32
	public static double caf(double grados) {
		return (grados * 1.8) + 32;
	}

	public static double fac(double grados) {
		return (grados - 32) * 5 / 9;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double grad = 0;
		int dato = 0;
		int opcion;

		// entrada
		do {

			System.out.println("Opciones:");
			System.out.println("Pulse 1 para pasar de �C a �F");
			System.out.println("Pulse 2 para pasar de �F a �C");
			System.out.println("Escribe 3 Para salir");
			dato = sc.nextInt();

			switch (dato) {
			case 1: {
				System.out.print("Escriba los grados �C: ");
				grad = sc.nextInt();
				System.out.println(grad + " �C son " + caf(grad) + " �F");

				break;
			}
			case 2: {
				System.out.print("Escriba los grados �F: ");
				grad = sc.nextInt();
				System.out.println(grad + " �F son " + fac(grad) + " �C");
				break;
			}
			case 3: {
				System.out.println("Gracias por su visita");
				break;
				
		
			}
			default:
			System.out.println("no s� que quieres, chao");

			}

			System.out.println("Pulse 1 para seguir o 2 para salir");
			opcion = sc.nextInt();
		} while (opcion < 3);
		System.out.println("Fin");
		System.out.println("  ");
		
		sc.close();

	}
}
