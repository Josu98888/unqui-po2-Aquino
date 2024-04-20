package ar.edu.unq.po2.tp4;
import java.util.ArrayList;

public class Supermercado {
	private String nombre ;
	private String direccion ;
	private ArrayList<Producto> catalogo;
	
	
	
	public Supermercado(String nombre, String direccion, ArrayList<Producto> catalogo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogo = new ArrayList<>() ;
	}

	public void agregarProducto(Producto producto) {
		catalogo.add(producto) ;
	}
	
	public int totalProductos() {
		return catalogo.size();
	}
	
	public double sumaTotalDePrecios() {
		double cantidad = 0 ;
		for (Producto producto : catalogo) {
			cantidad += producto.aplicarDecuentoSiEsPrimeraNecesidad() ;
		}
		return cantidad ;
	}
}
