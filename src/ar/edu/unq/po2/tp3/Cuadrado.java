package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(int lado) {
        // Llamamos al constructor de la superclase Rectangulo con las coordenadas apropiadas para un cuadrado
        super(new Point(0, 0), new Point(lado, lado));
    }
    public double getLado() {
        // Como es un cuadrado, el lado es igual al ancho o la altura
        return super.getAncho(); 
    }
}
