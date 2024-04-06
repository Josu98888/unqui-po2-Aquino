package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReciboDeHaberes {
	private String nombreEmpleado;
	private String dirección;
	private LocalDate fechaEmisión;
	private double sueldoBruto;
	private double sueldoNeto;
	private ArrayList<Concepto> desgloce ;
	
	public ReciboDeHaberes(String nombreEmpleado, String dirección, LocalDate fechaEmisión, double sueldoBruto,
			double sueldoNeto, ArrayList<Concepto> desgloce) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.dirección = dirección;
		this.fechaEmisión = fechaEmisión;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloce = desgloce;
	}
		
}
