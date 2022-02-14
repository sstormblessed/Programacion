package POO;

public class satelite {

		//atributos
		private double meridiano;
		private double paralelo;
		private double distancia;
		
		//constructores
		satelite(double m,double p,double d){
			meridiano = m;
			paralelo = p;
			distancia = d;
		}
		satelite (){
			meridiano = paralelo = distancia = 0;
		}

		
		public void printPosition (double m,double p,double d){
			meridiano = m;
			paralelo = p;
			distancia = d;
			}

		public void setPosicion(double m,double p,double d){
			meridiano = m;
			paralelo = p;
			distancia = d;
		}
		
		public String toString() {
			return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo
					+ ", distancia=" + distancia + "]";
		}
}
