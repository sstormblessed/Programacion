package arrays;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  enteros[] = {121,232,453,474,456};
		
		int tamaño= enteros.length;
	
		System.out.println(enteros.toString());
		
		for(int i=0;i<tamaño;i++) {
			System.out.println("indice es: "+ i+ " valor almacenado: "+enteros[i]);
		}
		System.out.println("-----------------------");
		float[] flotantes = new float[4];
		for(int i=0;i<flotantes.length;i++) {
			System.out.println("indice es: "+ i+ " valor almacenado: "+flotantes[i]);
		}
		System.out.println("-----------------------");
		
		int [] a = {10, 20, 30, 40, 50};
		int [] b = {50, 60, 70, 80, 100};
		//int [] c = a + b;
		
		int[] suma = new int[5];
		
		for(int i=0;i<a.length;i++) {
			
			suma[i]=a[i]+b[i];
			System.out.println("indice es: "+ i+ " suma almacenado: "+suma[i]);
		}
		
		System.out.println("-----------------------");
		
		@SuppressWarnings("unused")
		int r = a[3] + b[4];
	}
}
