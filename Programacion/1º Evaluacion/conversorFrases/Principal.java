package conversorFrases;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String frase = "";
		
		if(frase == null) {
			frase = "";
		}
		ConversorFrases conv = new ConversorFrases();
		System.out.println(conv.pasarMayusculas("Est�s bobo o qu�?"));
	}
}
