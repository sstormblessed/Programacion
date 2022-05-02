package BoletinPOO;

/*
  Los constructores que se implementaran serán:  
  Recuerda que debes llamar al constructor de la clase padre.
  Los métodos que se implementara serán: 
  Método get de carga.  
*/


public class Lavadora extends Electrodomestico {

	private final int CARGA_DEF=5;
	int carga;
	
	//Un constructor por defecto.  
	 Lavadora(){
		 super();
		 carga=CARGA_DEF;
	 }
	//Un constructor con el precio y peso. El resto por defecto.  
	Lavadora(float pre,float pes){
		super(pre,pes);
		carga=CARGA_DEF;
	}
	 
	//Un constructor con la carga y el resto de atributos heredados. 
	Lavadora(float precio, float peso, consumo con, colores col, int car){
		super(precio, peso, con, col);
		carga=car;
	}
	public int getCarga() {
		return carga;
	}
	
	/* precioFinal():, si tiene una carga mayor de 30 kg, 
	 * aumentara el precio  50 €, 
	 * sino es así no se incrementara el precio. 
	 * Llama al método padre y añade el código necesario. 
	 * Recuerda que las condiciones que  hemos visto en la clase 
	 * Electrodomestico también deben afectar al  precio.  (non-Javadoc)
	 * @see objetos.Electrodomestico#precioFinal()
	 */

	@Override
	public float precioFinal() {
		float importe=0;
		//primero calculamos el precio final por ser
		//electrodomestico
		importe+=super.precioFinal();
		//segundo añade pluses si hace falta
		//por culpa de la carga
		if(carga>30)
			importe+=50;
		return importe;
	 }	
		
		
	}