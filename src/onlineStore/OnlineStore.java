package onlineStore;
import controlador.Controlador;
import vista.GestionOS;

import java.util.Scanner;

public class OnlineStore {

	public static void main(String[] args) {
		GestionOS gestion = new GestionOS();
		gestion.inicio();
	}
	private Controlador controlador;
	Scanner teclado = new Scanner(System.in);

	public void GestionOS()
	{
		controlador = new Controlador();
	}

	public void inicio() {

		boolean salir = false;
		String opcion;

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
			System.out.println("10. Mostrar pedidos enviados" );
			System.out.println("0. Salir" );
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
					break;
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

		} while(!salir);


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

	private void mostrarClientesPremium() {
		// TODO Auto-generated method stub

	}

	private void mostrarClientesEstandar() {
		// TODO Auto-generated method stub

	}

	private void mostrarClientes() {
		// TODO Auto-generated method stub

	}

	private void addCliente() {
		// TODO Auto-generated method stub

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
