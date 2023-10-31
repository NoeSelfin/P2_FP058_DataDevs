package controlador;

import java.util.*;

import modelo.*;
import vista.GestionOS;

public class Controlador {
	private Datos datos;

	public Controlador()
	{
		datos = new Datos();
	}

	public void addArticulo(Integer codigo, String descripcion, float precio, float gastos, Integer preparacion)
	{
		datos.addArticulo(codigo, descripcion, precio, gastos, preparacion);
	}

	public void mostrarArticulos()
	{
		datos.mostrarArticulos();
	}

	public void addCliente(String nombre, String domicilio, String email, String nif, String tipoCliente)
	{
		datos.addCliente(nombre, domicilio, email, nif, tipoCliente);
	}

	public void mostrarClientes()
	{
		datos.mostrarClientes();
	}

	public void mostrarClientesEstandar()
	{
		datos.mostrarClientesEstandar();
	}

	public void mostrarClientesPremium()
	{
		datos.mostrarClientesPremium();
	}

	public void addPedido(int numeroPedido, int cantidadArticulos, Cliente cliente, Articulo articulo, int cantidad)
	{
		datos.addPedido(numeroPedido, cantidadArticulos, cliente, articulo, cantidad);
	}

	public void mostrarPedidos()
	{
		datos.mostrarPedidos();
	}

	public void eliminarPedido(int numeroPedido)
	{
		datos.eliminarPedido(numeroPedido);
	}

	public boolean existePedido(int numPedido)
	{
        return false;
    }
}

