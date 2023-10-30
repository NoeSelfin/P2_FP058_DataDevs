package modelo;

import java.util.ArrayList;

public class Lista<T> {
	protected ArrayList<T> lista;
	
	public Lista () {
		lista = new ArrayList<>();
	}
	
	public int getSize() {
		return 0;
		//Código
	}

	public void add(T t) {
		lista.add(t);
	}
	
	public void borrar(T t) {
		lista.add(t);
	}
	public T getAt(int position) {
		return null;
		//código
	}
	public void clear() {
		//código
	}
	public boolean isEmpty() {
		return false;
		//código
	}

	public ArrayList getArrayList() {
		return lista;
	}
	public void printList(){
		System.out.println("******* LISTADO  ********");
		for (T t : this.lista) {
			System.out.println(t);
		}
		System.out.println();
	}

}
