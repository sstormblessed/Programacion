package Listas;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5. Crea el programa GESTISIMAL (GESTI�n SIMplifcada de Almac�n) para llevar
 *    el control de los art�culos de un almac�n. De cada art�culo se debe saber
 *    el c�digo, la descripci�n, el precio de compra, el precio de venta y el
 *    stock (n�mero de unidades). El men� del programa debe tener, al menos, las
 *    siguientes opciones:
 *    <p>
 *    1. Listado
 *    2. Alta
 *    3. Baja
 *    4. Modifcaci�n
 *    5. Entrada de mercanc�a
 *    6. Salida de mercanc�a
 *    7. Salir
 *    <p>
 *    La entrada y salida de mercanc�a supone respectivamente el incremento y
 *    decremento de stock de un determinado art�culo. Hay que controlar que no
 *    se pueda sacar m�s mercanc�a de la que hay en el almac�n.
 *    
 *    @author Luis Jos� S�nchez
 */

public class Gestisimal {

	public static void anadirArticulo(ArrayList<Articulo> almacen) {

		Scanner lector = new Scanner(System.in);

		Articulo producto = new Articulo();

		System.out.println("Introduce los datos del art�culo");

		System.out.print("C�digo: ");
		String codigoIntroducido = lector.nextLine();
		producto.setCodigo(codigoIntroducido);

		System.out.print("Descripci�n: ");
		String descripcionIntroducida = lector.nextLine();
		producto.setDescripcion(descripcionIntroducida);

		System.out.print("Precio de Compra: ");
		double precioDeCompraIntroducido = lector.nextDouble();
		producto.setPrecioDeCompra(precioDeCompraIntroducido);

		System.out.print("Precio de Venta: ");
		double precioDeVentaIntroducido = lector.nextDouble();
		producto.setPrecioDeVenta(precioDeVentaIntroducido);

		System.out.print("Stock: ");
		int stockIntroducido = lector.nextInt();
		producto.setStock(stockIntroducido);

		almacen.add(producto);

		lector.close();
	}

	public static void listarArticulos(ArrayList<Articulo> almacen) {
		for (Articulo i : almacen) {
			System.out.println(i.toString());
		}
	}

	public static void modificarDisco(ArrayList<Articulo> almacen, String codigo) {

		Scanner lector = new Scanner(System.in);
		for (Articulo producto : almacen) {
			if (producto.getCodigo().equals(codigo)) {

				System.out.println("Introduzca los nuevos datos del Producto o INTRO para dejarlos como estaban.");

				System.out.println("C�digo: " + producto.getCodigo());
				System.out.print("Nuevo c�digo: ");
				String codigoIntroducido = lector.nextLine();
				if (!codigoIntroducido.equals("")) {
					producto.setCodigo(codigoIntroducido);
				}

				System.out.println("Descripci�n: " + producto.getDescripcion());
				System.out.print("Nueva Descripci�n: ");
				String descripcionIntroducida = lector.nextLine();
				if (!descripcionIntroducida.equals("")) {
					producto.setDescripcion(descripcionIntroducida);
				}

				System.out.println("Precio de Compra: " + producto.getPrecioDeCompra());
				System.out.print("Nuevo Precio de Compra: ");
				double precioDeCompraIntroducido = lector.nextDouble();
				if (precioDeCompraIntroducido >= 0 ) {
					producto.setPrecioDeCompra(precioDeCompraIntroducido);
				}

				System.out.println("Precio de Venta: " + producto.getPrecioDeVenta());
				System.out.print("Nuevo Precio de Venta: ");
				double precioDeVentaIntroducido = lector.nextDouble();
				if (precioDeVentaIntroducido >= 0) {
					producto.setPrecioDeVenta(precioDeVentaIntroducido);
				}

				System.out.println("Stock: " + producto.getStock());
				System.out.print("Nuevo Stock: ");
				int stockIntroducido = lector.nextInt();
				if (stockIntroducido >= 0) {
					producto.setStock(stockIntroducido);
				}

			}
		}

		lector.close();
	}

	public static void borrarArticulo(ArrayList<Articulo> almacen, String codigo) {
		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getCodigo().equals(codigo)) {
				System.out.println("Producto Encontrado.");
				System.out.println(almacen.get(i).toString());
				almacen.remove(i);
			} // fin if
		} // fin for
	}

	public static void mostrarMenu() {
		System.out.println("\n\nGESTI�N DE ALMAC�N");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Art�culo");
		System.out.println("3. Modificar Art�culo");
		System.out.println("4. Borrar Art�culo");
		System.out.println("5. Entrada de Mercanc�a");
		System.out.println("6. Salida de Mercanc�a");
		System.out.println("7. Salir");
		System.out.print("Introduzca una opci�n: ");
	}

	public static void menu(ArrayList<Articulo> almacen) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		/* EMPIEZA MENU */
		do {
			mostrarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1: // LISTADO
				System.out.println("\nLISTADO");
				System.out.println("=======");
				// listarDiscos(album);
				break;
			case 2: // A�ADIR
				System.out.println("\nNUEVO ART�CULO");
				System.out.println("===========");
				// anadirDisco(album);
				break;
			case 3: // MODIFICAR
				System.out.println("\nMODIFICAR ART�CULO");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el c�digo del art�culo que desea modificar: ");
					sc.nextLine();
				// modificarDisco(album, codigoIntroducido);
				break;
			case 4: // BORRAR
				System.out.println("\nBORRAR ART�CULO");
				System.out.println("======");
				System.out.print("Por favor, introduzca el c�digo del art�culo que desea borrar: ");
					sc.nextLine();
				// borrarDisco(album, codigoIntroducido);
				break;
			case 5: // ENTRADA DE MERCANC�A
				System.out.println("\nENTRADA DE MERCANC�A");
				System.out.println("======");
				System.out.println();
				break;
			case 6: // SALIDA DE MERCANC�A
				System.out.println("\nSALIDA DE MERCANC�A");
				System.out.println("======");
				System.out.println();
				break;
			case 7:
				System.out.println("ABANDONANDO PROGRAMA...");
				System.out.println("PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("Opci�n no v�lida");
			} // switch
		} while (opcion != 7);
		/* FIN DE MENU */

		sc.close();
	}

	public static ArrayList<Articulo> modeloDatos() {
		ArrayList<Articulo> almacen = new ArrayList<Articulo>();
		return almacen;
	}

	public static void main(String[] args) {
		menu(modeloDatos());
	}
}
