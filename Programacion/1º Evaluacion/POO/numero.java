package POO;

public class numero {

	
	//atributo
	int n;
	
	numero(int n) {
		this.n = n;
	}
	
	public int calcularDoble() {
		return n * 2;
	}
	
	public int calcularTriple() {
		return n * 3;
	}
	 
	public int calcularQuad() {
		return n * 4;
	}
	
	public int calcularCuadrado() {
		return n * n;
	}
	
	public int calcularPotenciaOctava() {
		return (int) Math.pow(n, 8);
	}
	
	public int calcularPotenciaGeneral(int exp) {
		return (int) Math.pow(n, exp);
	}
	
	public double calcularRaizCuadrada() {
		return Math.sqrt(n);
	}

	@Override
	public String toString() {
		return "numero [n=" + n + "]";
	}
	
	
}
