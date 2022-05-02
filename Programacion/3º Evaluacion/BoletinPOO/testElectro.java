package BoletinPOO;

import BoletinPOO.Electrodomestico.colores;
import BoletinPOO.Electrodomestico.consumo;


public class testElectro {
	/*Crea un array de Electrodomesticos de 10 posiciones.
	 Asigna a cada posición un objeto de las clases anteriores 
	 con los valores que desees.
	 Ahora, recorre este array y ejecuta el método precioFinal().
	 
	Recuerda el uso operador instanceof.
	
	Por ejemplo, si tenemos un Electrodomestico con un precio final de 300,
	 una lavadora de 200 y una televisión de 500, 
	 el resultado final sera de 1000 (300+200+500) para electrodomésticos,
	  200 para lavadora y 500 para 	televisión.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float total=0;
		Electrodomestico uno= new Electrodomestico(300, 23, 
				consumo.C, colores.rojo);
		//System.out.println(uno.precioFinal());
		
		Electrodomestico dos= new Lavadora(200, 12, consumo.D, colores.azul, 8);
		//System.out.println(dos.precioFinal());
		
		Electrodomestico tres = new Television(500, 4, consumo.A, 
				colores.negro, 44, true);
		//System.out.println(tres.precioFinal());
		
		Electrodomestico[] varios = {uno,dos,tres};
		
		for(Electrodomestico e: varios) {
			System.out.println(e.toString());
			System.out.println(e.precioFinal());
			total+=e.precioFinal();
		}
		
		System.out.println(total);
		
	}

}