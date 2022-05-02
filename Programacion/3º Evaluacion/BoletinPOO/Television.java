package BoletinPOO;

/*
Método get de resolución y sintonizador TDT.
precioFinal(): si tiene una resolución mayor de 40 pulgadas, se
incrementara el precio un 30% y si tiene un sintonizador TDT
incorporado, aumentara 50 €. Recuerda que las condiciones que
hemos visto en la clase Electrodomestico también deben afectar al
precio.*/
public class Television extends Electrodomestico {

	//constantes
	private final int RES_DEF=20;
	private final boolean SM_DEF=false;
	//atributos
	int resolucion; //inches
	boolean smart;  //es o no es smart tv
	
	//constructores
	 //Un constructor por defecto.
	 Television(){
		 super();
		 resolucion=RES_DEF;
		 smart=SM_DEF;
	 }
	
	//Un constructor con el precio y peso. El resto por defecto.
	 Television(float pre, float pes){
		 super(pre, pes);
		 resolucion=RES_DEF;
		 smart=SM_DEF;
	 }
	
	//Un constructor con la resolución, smart y el resto de
	//atributos heredados. 
	 Television(float precio, float peso, consumo con, 
			 colores col, int res, boolean s){
		 super(precio, peso, con, col);
		 this.resolucion=res;
		 this.smart=s;
	 }
	 @Override
	 public float precioFinal() {
			float importe=0;
			//primero calculamos el precio final por ser electrodomestico
			importe+=super.precioFinal();
			//segundo añade pluses si hace falta
			//por culpa de la resolucion y del smart
			if(resolucion>40)
				//importe   = 1*importe + 0.3f*importe;
			     // importe=1.3f*importe;
				importe*=1.3f;
			if(smart)
				importe+=50;
			return importe;
		 }	
}