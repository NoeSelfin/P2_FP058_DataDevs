package modelo;

public class ListaArticulos  extends Lista<Articulo>{

    public void printList(){
        System.out.println("******* LISTADO DE ARTÍCULOS  ********");
        for (Articulo articulo : this.lista) {
            System.out.println("Artículo con índice " + this.lista.indexOf(articulo) + ": " + articulo);
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return "Listado de Articulos " + this.lista;
    }
}
