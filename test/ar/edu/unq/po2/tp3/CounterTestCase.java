package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
    counter = new Counter();
	counter.agregarNumero(1);
	counter.agregarNumero(3);
	counter.agregarNumero(5);
	counter.agregarNumero(7);
	counter.agregarNumero(9);
	counter.agregarNumero(1);
	counter.agregarNumero(1);
	counter.agregarNumero(1);
	counter.agregarNumero(1);
	counter.agregarNumero(4);
	}

	@Test
	public void testCantidadDePares() {
		int contador = counter.cantidadDePares();
	    assertEquals(contador, 1);
	}
	@Test
	public void tesCantidadDeImpares() {
		int contador = counter.cantidadDeImpares();
		assertEquals(contador, 9);
	}
	@Test 
	void testCantidadDeMultiplos() {
		int contador = counter.cantidadDeMultiplos(3);
		assertEquals(contador, 2);
	}
	
	@Test
	public void testMayorCantidadDigitosPares() {
		counter.borrarLista() ;
		counter.agregarNumero(202056);
		counter.agregarNumero(3456);
		counter.agregarNumero(76489);
		counter.agregarNumero(2268634);
		counter.agregarNumero(2456);
		counter.agregarNumero(9034);
		int numero = counter.mayorCantidadDigitosPares();
		assertEquals(numero, 2268634);
	}
	@Test
	public void testCantidadDigitosPares() {
		int numero = counter.contarDigitosPares(2268634);
		assertEquals(numero, 6);
	}
	@Test
	public void testEncontrarMultiploComun() {
        int resultado = counter.encontrarMultiploComun(3, 9);
        assertEquals(resultado, 999);
        int resultado2 = counter.encontrarMultiploComun(333, 5);
        assertEquals(resultado2, -1);
	}
}
