package POO;

public class testFinanzas {

	public static void main(String[] args) {
		//Creo un objeto con cambio 1.36
		finanzas antiguo = new finanzas(1.36);
		System.out.println(antiguo.toString());
		
		//Lo uso
		System.out.println(antiguo.dolaresToEuro(100));
		System.out.println(antiguo.eurosToDolares(1000));
		
		System.out.println();
		
		//Creo un objeto con cambio 1.16
		finanzas hoy = new finanzas(1.16);
		System.out.println(hoy.toString());
		//Lo uso
		System.out.println(hoy.dolaresToEuro(100));
		System.out.println(hoy.eurosToDolares(1000));
		
	}
}
