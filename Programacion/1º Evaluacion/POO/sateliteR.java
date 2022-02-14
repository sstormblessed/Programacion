package POO;

public class sateliteR {

			//atributos
			private double meridiano;
			private double paralelo;
			private double distancia;
			
			//constructores
			sateliteR(double m,double p,double d){
				meridiano = m;
				paralelo = p;
				distancia = d;
			}
			sateliteR(){
				meridiano = paralelo = distancia = 0;
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
			
			public void variaAltura(double desplazamiento) {
				this.distancia += desplazamiento;
			}
			
			public void variaPosicion(double variap, double variam) {
				this.paralelo += variap;
				this.meridiano += variam;
			}
			
			public boolean enOrbita() {
				return (distancia > 0);
			}
			
			//quiero variar los 3 atributos
			public void variaCoordenadas(double p, double m, double d) {
				variaAltura(d);
				variaPosicion(p, m);
			}
}
