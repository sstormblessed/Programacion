package POO;

public class coche {

	/*A�ade a la clase coche los siguientes m�todos:

	void acelera(int mas). Este m�todo actualiza la velocidad a mas kil�metros m�s.
	void frenafint menos). Este m�todo actualiza la velocidad a menos kil�metros menos.
	*/
	/*un coche no puede sobrepasar velocidad 120 */
	/*un coche no puede ir a velocidad menor que cero*/

		private int velocidad;
		private String marca;
		private String modelo;
		
		public void setVelocidad(int v) {
			this.velocidad = v;
		}
		
		public int getVelocidad() {
			return this.velocidad;
		}
		
		coche (){  //por defecto
			this.velocidad = 0;
			this.marca = "";
			this.modelo = "";
			}
		
		coche(int velo, String mar, String mod){  //con todos los atributos
			this.velocidad = velo;
			this.marca = mar;
			this.modelo = mod;
		}

		void acelera(int more) {
			if(velocidad + more > 120)
				this.velocidad = 120;
			else
				this.velocidad += more;
		} 
		
		void frena(int less) {
			if(velocidad - less < 0)
				this.velocidad = 0;
			else	
				this.velocidad -= less;
			}

		@Override
		public String toString() {
			return "coche [velocidad=" + velocidad + ", marca=" + marca + ", modelo=" + modelo + "]";
		}
		
	}
	
