package modelo;

public class ListaPedidos extends Lista<Pedido> {

	public ListaPedidos() {
		super();
	}

	public void add(Pedido pedido) {
		super.add(pedido);
	}

	public void borrar(Pedido pedido) {
		super.borrar(pedido);
	}

	public Pedido getAt(int position) {
		return super.getAt(position);
	}

	public void clear() {
		super.clear();
	}

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return super.getSize();
	}

	public void printList() {
		System.out.println("******* PEDIDOS  ********");
		for (Pedido pedido : this.lista) {
			System.out.println(this.lista.indexOf(pedido)+1 + ": " + pedido);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Lista de Pedidos: " + this.lista;
	}

	public void eliminarPedido(int numeroPedido) {
		for (Pedido pedido : this.lista) {
			if (pedido.getNumeroPedido() == numeroPedido) {
				this.lista.remove(pedido);
				System.out.println("Pedido eliminado correctamente");
				return;
			}
		}
		System.out.println("No se ha encontrado el pedido");
	}


}
