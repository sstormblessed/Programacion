package ejercicios;

import java.util.Scanner;

public class gradosIria {

	public static double celsiusToF(double a) {
		return (a*9/5) + 32;	
	}
	
	public static double FahToC(double a) {
		return (a-32)*5/9; 	
	}
	
	public static void main(String [] args) {
		int elixir;
		double numero;
		double resultado;
		
		Scanner scanner= new Scanner(System.in);	

		System.out.println("Pulsa 1 pra �C a �F, pulsa 2 pra �F a �C, pulsa 3 pra sair");
		elixir=scanner.nextInt();
		
			
		switch (elixir) {
			case 1:	
			System.out.print("Introduza o n�mero a converter:");
			numero=scanner.nextDouble();
			System.out.println( numero + "�C son "+ celsiusToF(numero) + " �F");
			break;
			case 2:
			System.out.print("Introduza o n�mero a converter:");
			numero=scanner.nextDouble();
			System.out.println( numero + "�F son " + FahToC(numero) + " �C");
			break;
			case 3:
			System.out.println("Adeus");
			break;
			}
		}
		
	}