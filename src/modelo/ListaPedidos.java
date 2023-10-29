package modelo;

public class ListaPedidos extends Lista<Pedido>{
    @Override
    public String toString() {
        return "Lista de Pedidos: " + this.lista;
    }
}
