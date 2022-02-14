package arrays;

import java.util.Arrays;

public class Ejemplo2B {
	
	public static void main(String[] args) {

		double[] uno = { 1.1, 2.6, 7.8, 4.3 };
		double[] dos = { 3.4, 5, 8.1, 9.78 };
		double[] suma = new double[4];

		if (uno.length == dos.length) {
			for (int k = 0; k < uno.length; k++) {
				suma[k] = uno[k] + dos[k];
			}
			System.out.println("primer array");
			System.out.println(Arrays.toString(uno));
			System.out.println("segundo array");
			System.out.println(Arrays.toString(dos));
			System.out.println("array con la suma de las posiciones individuales");
			System.out.println(Arrays.toString(suma));
		}
		else
			System.out.println("no se pueden sumar");
	}
}
