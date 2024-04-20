package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	private double costoPorUnidad ;
	private int unidadesConsumidas ;
	
	@Override
	public double getPrecio() {
		return costoPorUnidad * unidadesConsumidas ;
	}
}
