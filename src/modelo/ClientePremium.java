package modelo;

public class ClientePremium extends Cliente{

	public ClientePremium(String nombre, String domicilio, String email, String nif) {
		super(nombre, domicilio, email, nif);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipoCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float calcAnual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float descuentoEnv() {
		// TODO Auto-generated method stub
		return 0;
	}

}
