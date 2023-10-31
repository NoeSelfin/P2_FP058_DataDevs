package onlineStore;

import controlador.Controlador;
import java.lang.*;

import modelo.Articulo;
import modelo.Cliente;
import modelo.ClienteEstandard;
import modelo.ClientePremium;
import vista.GestionOS;

import java.time.*;
import java.util.*;
import java.util.Scanner;

import static com.sun.tools.classfile.Attribute.Exceptions;

public class OnlineStore {

	private Controlador controlador;
	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		OnlineStore gestion = new OnlineStore();
		gestion.inicio();
	}

	public void inicio() {
		controlador = new Controlador();
		boolean salir = false;
		String opcion;
		cargarDatosEjemplo();

		do {

			System.out.println("1. Añadir Artículo");
			System.out.println("2. Mostrar Artículos");
			System.out.println("3. Añadir Clientes");
			System.out.println("4. Mostrar Clientes");
			System.out.println("5. Mostrar Clientes Estándar");
			System.out.println("6. Mostrar Clientes Premium");
			System.out.println("7. Añadir Pedido");
			System.out.println("8. Eliminar Pedido");
			System.out.println("9. Mostar pedidos pendientes");
			System.out.println("10. Mostrar pedidos enviados");
			System.out.println("0. Salir");
			opcion = pedirOpcion();
			switch (opcion) {
				case "1":
					addArticulo();
					break;

				case "2":
					mostrarArticulos();
					break;
				case "3":
					addCliente();
					break;
				case "4":
					mostrarClientes();
				case "5":
					mostrarClientesEstandar();
					break;
				case "6":
					mostrarClientesPremium();
					break;
				case "7":
					addPedido();
					break;
				case "8":
					eliminarPedido();
					break;
				case "9":
					mostrarPedidosPendientes();
					break;
				case "10":
					mostrarPedidosEnviados();
					break;
				case "0":
					salir = true;
					break;
			}

		} while (!salir);

	}

	public void cargarDatosEjemplo() {
		controlador.addArticulo(111, "mesa", 40.5F, 10.5F, 5);
		controlador.addArticulo(222, "silla", 25.5F, 5.5F, 2);
		controlador.addArticulo(333, "armario", 115.5F, 25.5F, 15);
		controlador.addCliente("Ana", "C/Estevez 1", "ana@gmail.com", "44488765J", "Estándar");
		controlador.addCliente("Sofía", "Plaça Catalunya 2", "sofia@gmail.com", "78653325N", "Estándar");
		controlador.addCliente("Miguel", "Passeig de Gracia 2", "miguel@gmail.com", "6667895T", "Premium");
		controlador.addCliente("Carlos", "C/Verdi 7", "carlos@gmail.com", "17894565R", "Premium");
		controlador.addCliente("Carlos", "C/Verdi 7", "carlos@gmail.com", "17894565R", "Premium");

	}
	private void mostrarPedidosEnviados() {
		// TODO Auto-generated method stub

	}

	private void mostrarPedidosPendientes() {
		// TODO Auto-generated method stub

	}

	private void eliminarPedido() {
		// TODO Auto-generated method stub

	}

	private void addPedido () throws Exceptions {
		// TODO Auto-generated method stub
		int numClientes = 0;
		int numArticulos = 0;
		Cliente clientes = null;
		Articulo articulos = null;
		int unidades = 0;
		System.out.println("Numero de pedido: ");
		int numPedido = Integer.parseInt(teclado.nextLine());
		if (controlador.existePedido(numPedido)) {
			System.out.println("Ya existe un pedido con ese codigo");
			controlador.addPedido(numPedido, numArticulos, clientes, articulos, unidades);
		} else {
			System.out.println("Unidades: ");
			int numArticulosPedido = Integer.parseInt(teclado.nextLine()) ;

			unidades = numArticulosPedido;

			do{
				numArticulosPedido = Integer.parseInt(teclado.nextLine());

				if (numArticulosPedido < 0) {
					throw new Exceptions("El numero de unidades no puede ser negativo");
				} else if (numArticulosPedido > 10) {
					throw new Exceptions("El numero de unidades no puede ser mayor de 10");
				} else {
					System.out.println("El numero de unidades ha sido aceptado");
					unidades = numArticulosPedido;}

			} while(unidades==0);

			System.out.println("Escoge el cliente del pedido.");
			System.out.println("");

			for (int i = 0; i < controlador.datos.getClientes().getDato().size(); i++) {
				System.out.println(i + 1 + ". " + controlador.datos.getClientes().getDato().get(i).getNombre() + "\n");
				numClientes += Integer.valueOf(i + 1) + ",";
			}

			System.out.println("----------------------------------");
			do {
				System.out.println("Elige una opci�n (" + numClientes + "): ");
				clientes = teclado.nextLine();
			} while (!numClientes == 0);

			System.out.println("Escoge el articulo del pedido.");
			System.out.println("----------------------------------");
			// Aqui llamaremos al controlador para que nos devuelva la lista de clientes y
			// listarlos
			for (int i = 0; i < controlador.datos.getArticulos().getDatos().size(); i++) {
				System.out.println(i + 1 + ". " + controlador.datos.getArticulos().getDato().get(i).getDescripcion() + "\n");
				numArticulos += Integer.valueOf(i + 1) + ",";
			}

			System.out.println("----------------------------------");
			do {
				System.out.println("Elige una opci�n (" + numArticulos + "): ");
				articulos = teclado.nextLine();
			} while (!numArticulos.contains(clientes));

			System.out.println(controlador.addPedido(numPedido, numArticulos, clientes, articulos, unidades));

		}
	}

	private void mostrarPedidos() {
		controlador.mostrarPedidos();
}

	private void mostrarClientesEstandar() {
		controlador.mostrarClientesEstandar();

	}
	private void mostrarClientesPremium() {
		controlador.mostrarClientesPremium();

	}

	private void mostrarClientes() {
		controlador.mostrarClientes();
	}




	private void addCliente()  throws InputMismatchException {
		try {
			System.out.println("Nombre del cliente: ");
			String nombre = teclado.next();
			System.out.println("Domicilio del cliente: ");
			String domicilio = teclado.next(); // Cambio nextLine() a next()
			teclado.nextLine(); // Agrego esta línea para consumir el salto de línea pendiente

			System.out.println("Email del cliente: ");
			String email = teclado.next();
			System.out.println("NIF del cliente: ");
			String nif = teclado.next();

			System.out.println("Tipo de cliente (Estándar/Premium): ");
			String tipoCliente = teclado.next();

			controlador.addCliente(nombre, domicilio, email, nif, tipoCliente);
		} catch (InputMismatchException e) {
			System.out.println("Ha habido algún error en el tipo de dato introducido. Vuelve a intentarlo");
			System.exit(0);
		}

	}

	private void mostrarArticulos() {
		controlador.mostrarArticulos();

	}

	private void addArticulo() throws InputMismatchException {
		try {
			System.out.println("Código del artículo: ");
			Integer codigo = teclado.nextInt();
			System.out.println("Descripción: ");
			String descripcion = teclado.next();
			System.out.println("Precio: ");
			float precio = teclado.nextFloat();
			System.out.println("Gastos de envío: ");
			float gastos = teclado.nextFloat();
			System.out.println("Preparación: ");
			Integer preparacion = teclado.nextInt();
			controlador.addArticulo(codigo, descripcion, precio, gastos, preparacion);
		} catch(InputMismatchException e) {
			System.out.println("Ha habido algún error en el tipo de dato introducido. Vuelve a intentarlo");
			System.exit(0);
		}

	}

	private String pedirOpcion() {
		String respuesta;
		teclado = new Scanner(System.in);
		System.out.print("¿Qué quieres hacer?");
		respuesta = teclado.nextLine();
		return respuesta;
	}
}
