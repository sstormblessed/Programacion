package POO;

public class testCoche {

	public static void main(String[] args) {
		int vel = 100;
		int seco = 50;
		String brand = "Ford";
		String model = "Fiesta";
		
		coche uno = new coche();
		System.out.println(uno.toString());
		uno.acelera(15);
		System.out.println(uno.toString());
		uno.frena(35);
		System.out.println(uno.toString());
		
		coche dos = new coche(vel, brand, model);
		System.out.println(dos.toString());
		dos.acelera(2*vel);
		System.out.println(dos.toString());
		dos.frena(seco);
		System.out.println(dos.toString());
	}
}
