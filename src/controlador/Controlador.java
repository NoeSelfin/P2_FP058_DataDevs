package controlador;
import java.util.*;

import modelo.Articulo;
import modelo.Datos;
import vista.GestionOS;

public class Controlador {
	private Datos datos;

	public Controlador() {
		datos = new Datos();
	}

	public void addArticulo(int codigo, String descripcion, float precio, float gastos, int preparacion) {
		datos.addArticulo(codigo, descripcion, precio, gastos, preparacion);
	}

	public void mostrarArticulos() {
		datos.mostrarArticulos();
	}


}
