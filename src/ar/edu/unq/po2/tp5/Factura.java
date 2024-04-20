package ar.edu.unq.po2.tp5;

public abstract class  Factura implements Cobrable {
	private Agencia agenciaCobradora ;
	
	@Override
	public abstract double getPrecio() ;
	
	@Override
	public void registrarProducto() {
		agenciaCobradora.registrarPago(this);
	}

}
