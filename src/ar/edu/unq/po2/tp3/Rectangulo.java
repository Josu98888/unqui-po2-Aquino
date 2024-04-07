package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point esquinaSuperiorIzquierda;
    private Point esquinaInferiorDerecha;

    public Rectangulo(Point esquinaSuperiorIzquierda, Point esquinaInferiorDerecha) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        this.esquinaInferiorDerecha = esquinaInferiorDerecha;
    }

    public Point getEsquinaSuperiorIzquierda() {
        return esquinaSuperiorIzquierda;
    }

    public Point getEsquinaInferiorDerecha() {
        return esquinaInferiorDerecha;
    }

    public double getAncho() {
        return Math.abs(esquinaSuperiorIzquierda.getX() - esquinaInferiorDerecha.getX());
    }

    private double getAltura() {
        return Math.abs(esquinaSuperiorIzquierda.getY() - esquinaInferiorDerecha.getY());
    }

    public double getArea() {
        return getAncho() * getAltura();
    }

    public double getPerimetro() {
        return 2 * (getAncho() + getAltura());
    }
    public boolean esHorizontal() {
        return esquinaSuperiorIzquierda.getY() == esquinaInferiorDerecha.getY();
    }

    public boolean esVertical() {
        return esquinaSuperiorIzquierda.getX() == esquinaInferiorDerecha.getX();
    }
}
