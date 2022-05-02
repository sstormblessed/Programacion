package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class menuLista {

	public static void anadirDisco(ArrayList<Disco> album) {

		Scanner mal = new Scanner(System.in);
		// nuevo disco
		Disco dis = new Disco();

		System.out.println("Por favor, introduzca los datos del disco.");

		System.out.print("C�digo: ");
		String codigoIntroducido = mal.nextLine();
		dis.setCodigo(codigoIntroducido);

		System.out.print("Autor: ");
		String autorIntroducido = mal.nextLine();
		dis.setAutor(autorIntroducido);

		System.out.print("T�tulo: ");
		String tituloIntroducido = mal.nextLine();
		dis.setTitulo(tituloIntroducido);

		System.out.print("G�nero: ");
		String generoIntroducido = mal.nextLine();
		dis.setGenero(generoIntroducido);

		System.out.print("Duraci�n: ");
		int duracionIntroducida = Integer.parseInt(mal.nextLine());
		dis.setDuracion(duracionIntroducida);

		album.add(dis);
		
		mal.close();
	}

	public static void modificarDisco(ArrayList<Disco> album, String cod) {

		Scanner mal = new Scanner(System.in);
		for (Disco dis : album) {
			if (dis.getCodigo().equals(cod)) {

				System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

				System.out.println("C�digo: " + dis.getCodigo());
				System.out.print("Nuevo c�digo: ");
				String codigoIntroducido = mal.nextLine();
				if (!codigoIntroducido.equals("")) {
					dis.setCodigo(codigoIntroducido);
				}

				System.out.println("Autor: " + dis.getAutor());
				System.out.print("Nuevo autor: ");
				String autorIntroducido = mal.nextLine();
				if (!autorIntroducido.equals("")) {
					dis.setAutor(autorIntroducido);
				}

				System.out.println("T�tulo: " + dis.getTitulo());
				System.out.print("Nuevo t�tulo: ");
				String tituloIntroducido = mal.nextLine();
				if (!tituloIntroducido.equals("")) {
					dis.setTitulo(tituloIntroducido);
				}

				System.out.println("G�nero: " + dis.getGenero());
				System.out.print("Nuevo g�nero: ");
				String generoIntroducido = mal.nextLine();
				if (!generoIntroducido.equals("")) {
					dis.setGenero(generoIntroducido);
				}

				System.out.println("Duraci�n: " + dis.getDuracion());
				System.out.print("Duraci�n: ");
				String duracionIntroducidaString = mal.nextLine();
				if (!duracionIntroducidaString.equals("")) {
					dis.setDuracion(Integer.parseInt(duracionIntroducidaString));
				}

			} // fin if
		} // fin foreach

		mal.close();
	}

	public static void borrarDisco(ArrayList<Disco> album, String cod) {

		// no usar foreach para eliminar (interactuamos con la lista)
		for (int i = 0; i < album.size(); i++) {
			if (album.get(i).getCodigo().equals(cod)) {
				System.out.println("Album encontrado.");
				System.out.println(album.get(i).toString());
				album.remove(i);
			} // fin if
		} // fin for
	}

	public static void listarDiscos(ArrayList<Disco> album) {
		for (Disco d : album) {
			System.out.println(d.toString());
		}
	}

	public static void mostrarMenu() {
		System.out.println("\n\nCOLECCI�N DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.print("Introduzca una opci�n: ");
	}

	public static void menu(ArrayList<Disco> album) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String codigoIntroducido;
		/* EMPIEZA MENU */
		do {
			mostrarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1: // LISTADO
				System.out.println("\nLISTADO");
				System.out.println("=======");
				listarDiscos(album);
				break;
			case 2: // A�ADIR
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
				anadirDisco(album);
				break;
			case 3: // MODIFICAR
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
				codigoIntroducido = sc.nextLine();
				modificarDisco(album, codigoIntroducido);
				break;
			case 4: // BORRAR
				System.out.println("\nBORRAR");
				System.out.println("======");
				System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
				codigoIntroducido = sc.nextLine();
				borrarDisco(album, codigoIntroducido);
				break;
			case 5:
				System.out.println("ABANDONANDO PROGRAMA...");
				break;
			default:
				System.out.println("opcion no valida");
			} // switch
		} while (opcion != 5);
		/* FIN DE MENU */

		sc.close();
	}

	public static ArrayList<Disco> modeloDatos() {
		ArrayList<Disco> album = new ArrayList<Disco>();
		return album;
	}

	public static void main(String[] args) {
		menu(modeloDatos());
	}

}