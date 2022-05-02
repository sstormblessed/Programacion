package BoletinPOO;

import java.util.Random;

public class Persona {

	private final int NODISP = 5;
	private final int INFRA = -1;
	private final int NORM = 0;
	private final int SOBRE = 1;

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo; // (H hombre, M mujer),
	private int peso; // kg
	private double altura; // m

	public Persona() {
		this.sexo = 'H';
		this.DNI = generaDNI();
	}

	public Persona(String n, int e, char s) {
		this.nombre = n;
		this.edad = e;
		this.sexo = compruebaSexo(s);
		this.DNI = generaDNI();
	}

	public Persona(String nombre, int edad, char sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generaDNI();
		this.sexo = compruebaSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	private String generaDNI() {
		Random r = new Random();

		Integer cifras = r.nextInt(99999999 - 9999999 + 1) + 9999999;
		String cadena = "";
		cadena = String.valueOf(cifras);
		cadena += obtenerLetra(divideDNI(cifras));

		return cadena;

	}

	static char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			'H', 'L', 'C', 'K', 'E' };

	public static int divideDNI(Integer d) {
		return (int) (d % 23);
	}

	public static char obtenerLetra(int m) {
		return letra[m];
	}

	/**
	 * calcularIMC(): calculara si la persona esta en su peso ideal (peso en
	 * kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
	 * función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
	 * significa que esta por debajo de su peso ideal la función devuelve un 0 y si
	 * devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
	 * devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
	 */

	public int calcularIMC() {

		if (altura != 0) {
			double cuenta = peso / Math.pow(altura, 2);
			System.out.println(cuenta);

			if (cuenta < 20) {
				return INFRA;
			} else if (cuenta >= 20 && cuenta <= 25) {
				return NORM;
			} else {
				return SOBRE;
			}
		}else {
			return NODISP;
		}
	}

	// esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

	public boolean esMayorDeEdad() {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	/* comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
	 * no es correcto, sera H. No sera visible al exterior.
	 */

	private char compruebaSexo(char s) {
		if (s == 'H' || s == 'M') {
			return s;
		} else {
			return 'H';
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
