package modelo;

public class ListaClientes extends Lista<Cliente>{
    @Override
    public String toString() {
        return "Listado de Clientes " + this.lista;
    }

}
