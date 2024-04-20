package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre ;
	private double precio ;
	private boolean esPrecioCuidado = false ;
	private double descuentoAplicado ;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado, double descuentoAplicado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
		this.descuentoAplicado = descuentoAplicado;
	}

	public double aplicarDecuentoSiEsPrimeraNecesidad() {
		if (esPrecioCuidado ) {
			double precioProductoPrimeraNecesidad = precio * descuentoAplicado ;
			return precioProductoPrimeraNecesidad ;
		}
		else {
			return precio ;
		}
	}
	
	public double getPrecio() {
		return precio ;
	}
}
