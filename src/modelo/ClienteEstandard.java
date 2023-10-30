package modelo;

public class ClienteEstandard extends Cliente{

	public ClienteEstandard(String nombre, String domicilio, String email, String nif) {
		super(nombre, domicilio, email, nif, 1);

	}

	@Override
	public String tipoCliente() {
		return "Cliente Estandar";
	}

	@Override
	public float calcAnual() {
		return 30;
	}

	@Override
	public float descuentoEnv() {
		return 25;
	}

	@Override
	public String toString() {
		return "ClienteEstandard{} " + super.toString()+ ", coste="+ calcAnual()+ ", descuento=" + descuentoEnv();
	}
}
