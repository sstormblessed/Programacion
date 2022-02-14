package arrays;

public class Copia {
	
	public static void main(String[] args) {
		
		float[] listaNotas = { 2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f };
		
		// La copia debe tener el mismo tamaño que el original.
		float[] copiaListaNotas = new float[listaNotas.length];
		
		// Vamos copiando posición por posición.
		for (int i = 0; i < listaNotas.length; i++) {
			copiaListaNotas[i] = listaNotas[i];
		}
		
		// Mostramos la copia por pantalla.
		System.out.print("El array copiado es: [");
		for (int i = 0; i < listaNotas.length; i++) {
			System.out.print(copiaListaNotas[i] + "");
		}
		System.out.println("]");
	}
}
