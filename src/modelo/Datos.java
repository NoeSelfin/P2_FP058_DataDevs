package modelo;

public class Datos {
	private ListaArticulos listaArticulos;
	private ListaClientes listaClientes;
	private ListaPedidos listaPedidos;

	public Datos() {
		listaArticulos = new ListaArticulos();
		listaClientes = new ListaClientes();
		listaPedidos = new ListaPedidos();
	}

	public void addArticulo(Integer codigo, String descripcion, float precio, float gastos, Integer preparacion) {
		Articulo articulo = new Articulo(codigo, descripcion, precio, gastos, preparacion);
		listaArticulos.add(articulo);
		System.out.println("***Artículo correctamente añadido!!***");
		System.out.println(articulo.toString());
	}


	public void addPedido(Integer numeroPedido, Integer cantidadArticulos, Cliente cliente, Articulo articulo, Integer cantidad) {
		Pedido pedido = new Pedido(numeroPedido, cantidadArticulos, cliente, articulo, cantidad);
		listaPedidos.add(pedido);
		System.out.println("***Pedido correctamente añadido!!***");
		System.out.println(pedido.toString());
	}

	public void mostrarPedidos()
	{
		listaPedidos.printList();
	}
	public void eliminarPedido(int numeroPedido)
	{
		listaPedidos.eliminarPedido (numeroPedido);
		System.out.println("***Pedido correctamente eliminado!!***");
	}

	public void mostrarArticulos() {
		listaArticulos.printList();

	}

	public void addCliente(String nombre, String domicilio, String email, String nif, String tipoCliente) {

		Cliente cliente;

		if (tipoCliente.equalsIgnoreCase("Estándar")) {
			cliente = new ClienteEstandard(nombre, domicilio, email, nif);
		} else if (tipoCliente.equalsIgnoreCase("Premium")) {
			cliente = new ClientePremium(nombre, domicilio, email, nif);
		} else {
			System.out.println("Tipo de cliente no válido. Se creará como Estándar por defecto.");
			cliente = new ClienteEstandard(nombre, domicilio, email, nif);
		}

		listaClientes.add(cliente);
		System.out.println("***Cliente correctamente añadido!!***");
		System.out.println(cliente.toString());
	}

	public void mostrarClientes() {
		listaClientes.printList();
	}
 	public void mostrarClientesEstandar() {

		listaClientes.printListEstandar();
	}
	public void mostrarClientesPremium() {

		listaClientes.printListPremium();
	}


}
