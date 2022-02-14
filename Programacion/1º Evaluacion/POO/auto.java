package POO;

import java.util.Scanner;

public class auto {
	
	//Atributos (MEJORA DE CONSTRUCTORES)
	private String marca;
	private String modelo;
	private consumo centralita;
	
	//Constructores
	auto(String mar, String mod, double k, double l, double v, double p){
		this.marca = mar;
		this.modelo = mod;
		this.centralita = new consumo(k, l, v, p);
	}
	//Opciones de mejora de uso de atributos
	public static auto pideTodo() {
		@SuppressWarnings("resource")
		Scanner es = new Scanner(System.in);
		String mar;
		String mod;
		consumo central;
		auto bus;
		
		System.out.println("Introduce la marca del coche:");
		mar = es.next();
		System.out.println("Introduce el modelo del coche:");
		mod = es.next();
		central = consumo.pideInfo();
		
		bus = new auto(mar, mod, central);
		return bus;
	}
	
	public String dameInfo() {
		return centralita.dameInfo();
	}
	
	auto(String mar, String mod, consumo cen){
		this.marca = mar;
		this.modelo = mod;
		this.centralita = cen;
	}

	@Override
	public String toString() {
		return "auto [marca=" + marca + ", modelo=" + modelo + ", centralita=" + centralita + "]";
	}
	
}
