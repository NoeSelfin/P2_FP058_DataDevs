package modelo;

public class Datos {
	private ListaArticulos listaArticulos;
	private ListaClientes listaClientes;
	private ListaPedidos listaPedidos;
	
	public Datos () {
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

	public void mostrarPedidos() {
		listaPedidos.printList();
	}

	public void mostrarArticulos() {
		listaArticulos.printList();
	}


}
