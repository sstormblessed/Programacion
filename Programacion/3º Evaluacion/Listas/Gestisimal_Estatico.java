package Listas;

public class Gestisimal_Estatico {
	// N determina el tama�o del array
	static int N = 100;

	public static void main(String[] args) {

		int opcion;
		int primeraLibre;
		int i;
		int stockIntroducido;
		double precioDeCompraIntroducido;
		double precioDeVentaIntroducido;
		String codigo;
		String codigoIntroducido = "";
		String descripcionIntroducida;
		String precioDeCompraIntroducidoString;
		String precioDeVentaIntroducidoString;
		String stockIntroducidoString;
		boolean existeCodigo;

		// Crea el array de art�culos
		Articulo[] articulo = new Articulo[N];

		// Crea todos los art�culos que van en cada una de
		// las celdas del array
		for (i = 0; i < N; i++) {
			articulo[i] = new Articulo();
		}

		// Menu
		do {
			System.out.println("\n\nG E S T I S I M A L");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificaci�n");
			System.out.println("5. Entrada de mercanc�a");
			System.out.println("6. Salida de mercanc�a");
			System.out.println("7. Salir");
			System.out.print("Introduzca una opci�n: ");
			opcion = Integer.parseInt(System.console().readLine());

			switch (opcion) {

			/////////////////////////////////////////////////////////////////////////////
			// LISTADO //////////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////////////////

			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				for (i = 0; i < N; i++) {
					if (!articulo[i].getCodigo().equals("LIBRE")) {
						System.out.println(articulo[i]);
					}
				}

				break;

			/////////////////////////////////////////////////////////////////////////////
			// ALTA /////////////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////////////////

			case 2:
				System.out.println("\nNUEVO ART�CULO");
				System.out.println("==============");

				// Busca la primera posici�n libre del array
				primeraLibre = 0;
				codigo = articulo[primeraLibre].getCodigo();
				while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
					primeraLibre++;
					if (primeraLibre < N) {
						codigo = articulo[primeraLibre].getCodigo();
					}
				}

				if (primeraLibre == N) {
					System.out.println("Lo siento, a base de datos est� llena.");
				} else {

					// Introducci�n de datos

					System.out.println("Por favor, introduzca los datos del art�culo.");
					System.out.print("C�digo: ");

					// Comprueba que el c�digo introducido no se repita
					existeCodigo = true;
					while (existeCodigo) {
						existeCodigo = false;
						codigoIntroducido = System.console().readLine();

						for (i = 0; i < N; i++) {
							if (codigoIntroducido.equals(articulo[i].getCodigo())) {
								existeCodigo = true;
							}
						}

						if (existeCodigo) {
							System.out.println("Ese c�digo ya existe en la base de datos.");
							System.out.print("Introduzca otro c�digo: ");
						}
					} // while (existeCodigo)

					articulo[primeraLibre].setCodigo(codigoIntroducido);

					System.out.print("Descripcion: ");
					descripcionIntroducida = System.console().readLine();
					articulo[primeraLibre].setDescripcion(descripcionIntroducida);

					System.out.print("Precio de compra: ");
					precioDeCompraIntroducido = Double.parseDouble(System.console().readLine());
					articulo[primeraLibre].setPrecioDeCompra(precioDeCompraIntroducido);

					System.out.print("Precio de venta: ");
					precioDeVentaIntroducido = Double.parseDouble(System.console().readLine());
					articulo[primeraLibre].setPrecioDeVenta(precioDeVentaIntroducido);

					System.out.print("Stock: ");
					stockIntroducido = Integer.parseInt(System.console().readLine());
					articulo[primeraLibre].setStock(stockIntroducido);
				}

				break;

			/////////////////////////////////////////////////////////////////////////////
			// BAJA /////////////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////////////////

			case 3:
				System.out.println("\nBAJA");
				System.out.println("====");

				System.out.print("Por favor, introduzca el c�digo del art�culo que desea dar de baja: ");
				codigoIntroducido = System.console().readLine();

				i = -1;
				codigo = "";
				do {
					i++;
					if (i < N) {
						codigo = articulo[i].getCodigo();
					}
				} while (!(codigo.equals(codigoIntroducido)) && (i < N));

				if (i == N) {
					System.out.println("Lo siento, el c�digo introducido no existe.");
				} else {
					articulo[i].setCodigo("LIBRE");
					System.out.println("articulo borrado.");
				}

				break;

			/////////////////////////////////////////////////////////////////////////////
			// MODIFICACI�N /////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////////////////

			case 4:
				System.out.println("\nMODIFICACI�N");
				System.out.println("============");

				System.out.print("Por favor, introduzca el c�digo del art�culo cuyos datos desea cambiar: ");
				codigoIntroducido = System.console().readLine();

				i = -1;
				do {
					i++;
				} while (!((articulo[i].getCodigo()).equals(codigoIntroducido)));

				System.out.println("Introduzca los nuevos datos del art�culo o INTRO para dejarlos igual.");

				System.out.println("C�digo: " + articulo[i].getCodigo());
				System.out.print("Nuevo c�digo: ");
				codigoIntroducido = System.console().readLine();
				if (!codigoIntroducido.equals("")) {
					articulo[i].setCodigo(codigoIntroducido);
				}

				System.out.println("Descripci�n: " + articulo[i].getDescripcion());
				System.out.print("Nueva descripci�n: ");
				descripcionIntroducida = System.console().readLine();
				if (!descripcionIntroducida.equals("")) {
					articulo[i].setDescripcion(descripcionIntroducida);
				}

				System.out.println("Precio de compra: " + articulo[i].getPrecioDeCompra());
				System.out.print("Nuevo precio de compra: ");
				precioDeCompraIntroducidoString = System.console().readLine();
				if (!precioDeCompraIntroducidoString.equals("")) {
					articulo[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
				}
				System.out.println("Precio de venta: " + articulo[i].getPrecioDeVenta());
				System.out.print("Nuevo precio de venta: ");
				precioDeVentaIntroducidoString = System.console().readLine();
				if (!precioDeVentaIntroducidoString.equals("")) {
					articulo[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
				}
				System.out.println("Stock: " + articulo[i].getStock());
				System.out.print("Nuevo stock: ");
				stockIntroducidoString = System.console().readLine();
				if (!stockIntroducidoString.equals("")) {
					articulo[i].setStock(Integer.parseInt(stockIntroducidoString));
				}
				break;

			} // switch
		} while (opcion != 7);
	}
}