package POO;

public class testNumero {

	public static void main(String[] args) {
		
		numero n = new numero(42);
		System.out.println(n.toString());
		System.out.println();
		System.out.println(n.calcularDoble());
		System.out.println(n.calcularTriple());
		System.out.println(n.calcularQuad());
		System.out.println(n.calcularCuadrado());
		System.out.println(n.calcularPotenciaOctava());
		System.out.println(n.calcularPotenciaGeneral(10));
		System.out.println(n.calcularRaizCuadrada());
	}
}
