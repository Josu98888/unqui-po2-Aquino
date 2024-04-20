package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto{
	private double iva = 0.9 ;
	
	public ProductoDeCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	
	@Override 
	public double getPrecio() {
		return precio * iva ;
	}
}
