package ar.edu.unq.po2.tp2;

public class EmpleadoContratado {
	private int númeroDeContrato ;
	private MedioDePago medioDePago ;
	private double gastosAdministrativos = 50 ;
	
	public EmpleadoContratado(int númeroDeContrato, MedioDePago medioDePago) {
		this.númeroDeContrato = númeroDeContrato;
		this.medioDePago = medioDePago;
	}
	
	public double retenciones() {
		return gastosAdministrativos ;
	}
}
