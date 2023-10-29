package modelo;

public class ListaPedidos extends Lista<Pedido>{

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

	public void printList(){
		System.out.println("******* PEDIDOS  ********");
		for (Pedido pedido : this.lista) {
			System.out.println(pedido);
		}
		System.out.println();
	}
    @Override
    public String toString() {
        return "Lista de Pedidos: " + this.lista;
    }
}
