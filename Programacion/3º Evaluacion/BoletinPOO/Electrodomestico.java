package BoletinPOO;

public class Electrodomestico {

	// Constantes
	protected final float PRECIO_BASE_DEF = 100;
	protected final float PESO_DEF = 5;
	protected final colores COLOR_DEF = colores.blanco;
	protected final consumo CONSUMO_DEF = consumo.F;
	
	// Atributos
	protected float precio_base;
	protected float peso;
	protected consumo consumo_energetico;
	protected colores color;
	
	// Enumerados internos
	public enum consumo {
		A, B, C, D, E, F
	}

	public enum colores {
		blanco, negro, rojo, azul, gris
	}

	// Contructores
	
	// Constructor por defecto
	Electrodomestico(){
		this.peso = PESO_DEF;
		this.precio_base = PRECIO_BASE_DEF;
		this.consumo_energetico = CONSUMO_DEF;
		this.color = COLOR_DEF;
	}
	
	// Constructor por precio y peso
	Electrodomestico(float precio, float peso){
		this.peso = peso;
		this.precio_base = precio;
		this.consumo_energetico = CONSUMO_DEF;
		this.color = COLOR_DEF;
	}
	
	// Constructor con todos los atributos
	Electrodomestico(float precio, float peso, consumo con, colores col){
		this.peso = peso;
		this.precio_base = precio;
		this.consumo_energetico = con;
		this.color = col;
	}

		/*
	 * precioFinal(): según el CONSUMO, aumentara su precio A 100 € B 80 € 
	 * C 60 € D 50 € E 30 € F 10 € , y según su PESO, también. 
	 * Esta es la lista de precios:
	 * Entre 0 y 19 kg 10 € Entre 20 y 49 kg 50 € 
	 * Entre 50 y 79 kg 80 € Mayor que 80 kg 100 €
	 */
	public float precioFinal() {
		
		float importe=0;
		importe=precio_base;
		
		switch(consumo_energetico) {
			case A:
				importe+=100;
				break;
			case B:
				importe+=80;
				break;
			case C:
				importe+=60;
				break;
			case D:
				importe+=50;
				break;
			case E:
				importe+=30;
				break;
			case F:
				importe+=10;
				break;
			}
		
		if(peso<20)
			importe+=10;
		else if(peso<50)
			importe+=50;
		else if(peso<80)
			importe+=80;
		else
			importe+=100;
	
		return importe;
	}	
}
