package POO;

class pajaro {

	//variable para contar NO DEPENDE DE OBJETO
	// ES DE LA CLASE
	public static int numero = 0;
	
	// *** atributos o propiedades ****
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad

	// *** constructores de la clase ***
		pajaro(){
			numero++;
		}
		// es el por defecto tuneado
		pajaro(char c, int e){
			this.color = c;
			this.edad = e;
			numero++;
		}
		
		pajaro(char c){
			this.color = validaColor(c);
			numero++;
		}

		pajaro(int e){
			this.edad = validaEdad(e);	
			numero++;
		}
		
	// *** métodos de la clase ****
		
	public int validaEdad(int ed) {
		
		if(ed>0)
			return ed;
		else
			return 0;
		}
	public char validaColor(char k) {
		
		if(k == 'v' || k == 'n' || k == 'a' || k == 'g' || k == 'F' || k == 'b') {
			return k;}
		else
			return 'X';
	}
	
	public void setColor(char color) {
		this.color = color;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getColor() {
		return this.color;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void printEdad() {
		System.out.println(edad);
	}
	// Los pájaros son verdes, amarillos, grises, negros o blancos
	// No existen pájaros de otros colores
	public void printColor() {
		switch (color) {
		case 'v':
			System.out.println("verde");
			break;
		case 'a':
			System.out.println("amarillo");
			break;
		case 'g':
			System.out.println("gris");
			break;
		case 'n':
			System.out.println("negro");
			break;
		case 'b':
			System.out.println("blanco");
			break;
		case 'F':
			System.out.println("FRESITA");
			break;	
		default:
			System.out.println("color no establecido");
		}
	}
	
	@Override
	public String toString() {
		return "pajaro [color=" + color + ", edad=" + edad + "]";
	}

	
}