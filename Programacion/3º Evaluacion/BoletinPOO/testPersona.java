package BoletinPOO;

import java.util.Scanner;

public class testPersona {


	public static Persona pideDatos() {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String n = lector.nextLine();
		System.out.println("Edad: ");
		int e = lector.nextInt();
		System.out.println("Peso kg: ");
		int p = lector.nextInt();
		System.out.println("Altura m: ");
		double a = lector.nextDouble();
		System.out.println("Sexo H/M: ");
		char s = lector.next().charAt(0);
		
		lector.close();
		
		return new Persona(n, e, s, p, a);
	}
	
	public static void main(String[] args) {
		
		Persona uno = pideDatos();
		System.out.println(uno.toString());
		System.out.println(uno.calcularIMC());
		System.out.println(uno.esMayorDeEdad());
		
		Persona dos = new Persona();
		System.out.println(dos.toString());
		System.out.println(dos.calcularIMC());
		System.out.println(dos.esMayorDeEdad());
		
		Persona tres = new Persona("Roberta", 16, 'M');
		System.out.println(tres.toString());
		System.out.println(tres.calcularIMC());
		System.out.println(tres.esMayorDeEdad());
	}
	
}
