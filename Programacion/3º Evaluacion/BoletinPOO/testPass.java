package BoletinPOO;

public class testPass {

	public static void main(String[] args) {
		
		Password uno = new Password();
		System.out.println(uno.toString());
		
		for(int i = 0; i < 10; i++) {
			Password p = new Password(10);
			System.out.println(p.toString());
			System.out.println(p.esFuerte());
		}
	}
	
}
