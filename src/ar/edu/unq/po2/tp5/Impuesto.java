package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaDelServicio ;
	
	@Override
	public double getPrecio() {
		return tasaDelServicio ;
	}
}
