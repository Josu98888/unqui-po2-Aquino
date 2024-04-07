package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectangulo ;
	
	@BeforeEach
	public void setUp() throws Exception {
		 Point esquinaSuperiorIzquierda = new Point(0, 0);
	     Point esquinaInferiorDerecha = new Point(4, 3);
         rectangulo = new Rectangulo(esquinaSuperiorIzquierda, esquinaInferiorDerecha);
	}
	
	@Test
	void testPerimetro() {
		double perimetro = rectangulo.getPerimetro();
	    assertEquals(perimetro,14);
	}
	
	@Test
	void testArea() {
		double area = rectangulo.getArea();
	    assertEquals(area,12);
	}
	
	@Test
	void testEsHorizontal() {
		boolean esHorizontal = rectangulo.esHorizontal();
	    assertEquals(esHorizontal,false);
	}
	
	@Test
	void testEeVertical() {
		boolean esVertical = rectangulo.esVertical();
	    assertEquals(esVertical,false);
	}

}
