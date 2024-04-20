package ar.edu.unq.po2.tp5;

public class Producto  implements Cobrable {
	private String nombre;
	protected double precio ;
	private int stock ;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}
	 
	public void disminuirStock() {
		stock -= 1 ;
	}

	@Override
	public void registrarProducto() {
		this.disminuirStock();
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {
		return stock;
	}
}
