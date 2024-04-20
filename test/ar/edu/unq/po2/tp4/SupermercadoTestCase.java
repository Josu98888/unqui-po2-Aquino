package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTestCase {
	private Supermercado supermercado;

	@BeforeEach
	void setUp() throws Exception {
		Producto producto1 = new Producto("yerba",1000, true, 0.9) ;
		Producto producto2 = new Producto("azucar",1200, true, 0.9) ;
		Producto producto3 = new Producto("fideos",500, true, 0.9) ;
		Producto producto4 = new Producto("termo",10000, false, 0.9) ;
		Producto producto5 = new Producto("galletitas",800, true, 0.9) ;
		
		supermercado = new Supermercado("dia", "calchaqui 300", null) ;
		
		supermercado.agregarProducto(producto1) ;        supermercado.agregarProducto(producto2) ;        supermercado.agregarProducto(producto3) ;        supermercado.agregarProducto(producto4) ;        supermercado.agregarProducto(producto5) ;	}
	
	@Test
	void testAplicarDescuento() {
		Producto producto1 = new Producto("yerba",1000, true, 0.9) ;
		double precio = producto1.aplicarDecuentoSiEsPrimeraNecesidad();
	    assertEquals(precio, 900);
	}
	@Test
	void testCantidad() {
		int contador = supermercado.totalProductos();
	    assertEquals(contador, 5);
	}
	@Test
	void testTotalPrecios() {
		double total = supermercado.sumaTotalDePrecios();
	    assertEquals(total, 13150);
	}

}
