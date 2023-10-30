package onlineStore;

import controlador.Controlador;

import modelo.Cliente;
import modelo.ClienteEstandard;
import modelo.ClientePremium;
import vista.GestionOS;

import java.util.Scanner;

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

	private void addPedido() {
		// TODO Auto-generated method stub

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




	private void addCliente() {
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
	}

	private void mostrarArticulos() {
		controlador.mostrarArticulos();

	}

	private void addArticulo() {
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
	}

	private String pedirOpcion() {
		String respuesta;
		teclado = new Scanner(System.in);
		System.out.print("¿Qué quieres hacer?");
		respuesta = teclado.nextLine();
		return respuesta;
	}
}
