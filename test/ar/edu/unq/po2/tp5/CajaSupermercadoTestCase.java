package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CajaSupermercadoTestCase {
	private CajaSupermercado caja;
	private Producto yerba ;
	private Producto azucar ;
	private Producto harina ;
	
	@BeforeEach
	void setUp() throws Exception {
	    yerba = new Producto("yerba", 1000, 5) ;
	    azucar = new Producto("azucar", 1000, 3) ;
	    harina = new Producto("harina", 1000, 8) ;
		caja = new CajaSupermercado() ;
		caja.añadirACarrito(yerba);
		caja.añadirACarrito(azucar);
		caja.añadirACarrito(harina);
		
	}

	@Test
	void testMontoTotal() {
		double montoTotal = caja.registrarProductos() ;
		assertEquals(montoTotal, 3000);
	}
	@Test
	void testStock() {
		caja.registrarProductos() ;
		int stockYerba = yerba.getStock() ;
		int stockAzucar= azucar.getStock() ;
		int stockHarina = harina.getStock() ;
		
		assertEquals(stockYerba, 4);
		assertEquals(stockAzucar, 2);
		assertEquals(stockHarina, 7);
		
	}

}
