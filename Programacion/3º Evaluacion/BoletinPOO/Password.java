package BoletinPOO;

//import java.util.Random;

public class Password {

	int longitud;
	String contrasena;
	//int contMayus = 0;
	//int contMinus = 0;
	//int contNums = 0;
	//int contEspe = 0;
	
	Password() {
		contrasena = generarPass(8);
	}

	Password(int l) {
		longitud = l;
		contrasena = generarPass(l);
	}

	/*
	private static String generaPassword(int l) {

		String p = "";

		for (int i = 0; i < l; i++) {
			Random r = new Random();
			p += (char) (r.nextInt(122 - 48 + 1) + 48);

		}
		return p;
	}
	*/

	// ALTERNATIVA MEJORADA PARA CONTRASE�AS
	public String generarPass(int lon) {

		String aux = "";
		
		// Distingo may�sculas, min�sculas, d�gitos y caracteres especiales
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String min = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String esp = "!�?�&-_@#*";
		
		
		
		// Hace aleatoria la longitud en lugar de utilizar la que le pasamos al m�todo
		// int longitud= (int) (6+8*Math.random());

		for (int i = 0; i < lon; i++) {
			
			// Hay 25 may�sculas
			// Hay 25 min�sculas
			// Hay 10 d�gitos
			// Hay 10 caracteres especiales
			
			// Obtiene uno de cada
			int ale1 = (int) (25 * Math.random());
			int ale2 = (int) (25 * Math.random());
			int ale3 = (int) (10 * Math.random());
			int ale4 = (int) (10 * Math.random());
			// Genera un n�mero entre 0 y 9
			int ran = (int) (10 * Math.random());
			// Para ver cu�l le a�ado a la cadena en cada pasada
			if (ran < 3) {
				aux += may.charAt(ale1);
				//contMayus++;
			} else if (ran < 6) {
				aux += min.charAt(ale2);
				//contMinus++;
			} else if (ran < 8) {
				aux += num.charAt(ale3);
				//contNums++;
			} else if (ran < 10) {
				aux += esp.charAt(ale4);
				//contEspe++;
			}
		}
		return aux;
	}
	
	// esFuerte(): devuelve un booleano si es fuerte o no, para que sea
	// fuerte debe tener mas de 2 may�sculas, mas de 2 min�sculas y mas de
	// 4 n�meros o especiales.
	
	/*
	public boolean esFuerte() {
		if(contMayus > 2 && contMinus > 2 && (contNums > 4 || contEspe > 4)) {
			return true;
		}else {
			return false;
		}
	}
	*/
	
	public boolean esFuerte() {
		int may = 0;
		int min = 0;
		int dig = 0;
		int esp = 0;
		boolean fuerte = false;
		
		for(int i = 0; i < contrasena.length(); i++) {
			if(Character.isLowerCase(contrasena.charAt(i))) {
				min++;
			}
			if(Character.isUpperCase(contrasena.charAt(i))) {
				may++;
			}
			if(Character.isDigit(contrasena.charAt(i))) {
				dig++;
			}
		}
		
		esp = contrasena.length() - (may+min+dig);
		
		if(may > 2 && min > 2 && (dig+esp) >= 4) {
			fuerte = true;
		}else {
			fuerte = false;
		}
		
		return fuerte;
	}
	
	@Override
	public String toString() {
		return "Password [ contrase�a = " + contrasena + " ]";
	}

}
