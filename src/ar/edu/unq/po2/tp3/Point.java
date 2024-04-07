package ar.edu.unq.po2.tp3;

public class Point {
	private int x ;
	private int y ;
	
	// Constructor para crear un punto en las coordenadas(0,0)
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void mover(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
	
	public Point sumar(Point otroPunto) {
        int nuevaX = this.x + otroPunto.x;
        int nuevaY = this.y + otroPunto.y;
        return new Point(nuevaX, nuevaY);
    }
}
