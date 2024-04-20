package ar.edu.unq.po2.tp5;
import java.util.ArrayList;


public class CajaSupermercado {
	private ArrayList<Cobrable> carrito;
	
	
	public CajaSupermercado() {
		this.carrito = new ArrayList<>();
	}

	public void añadirACarrito(Cobrable cobrable) {
		carrito.add(cobrable) ;
	}

	public double registrarProductos() {
		double montoTotal = 0 ;
		for (Cobrable cobrable : carrito) {
			this.registrarProducto(cobrable) ;
			montoTotal += cobrable.getPrecio() ;
		}
		return montoTotal ;
	}
	
	public void registrarProducto(Cobrable cobrable) {
		cobrable.registrarProducto();
	}
}
