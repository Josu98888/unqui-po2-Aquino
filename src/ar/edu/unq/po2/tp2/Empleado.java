package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Empleado {
	private String nombre;
	private String dirección ;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	protected double sueldoBásico;
	
	public Empleado(String nombre, String dirección, String estadoCivil, LocalDate fechaNacimiento, double sueldoBásico) {
		this.nombre = nombre;
		this.dirección = dirección;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBásico = sueldoBásico;
	}
	
	public ArrayList<Concepto> desgloce() {
		ArrayList<Concepto> desgloce = new ArrayList<>() ;
		desgloce.add(new Concepto("sueldoBruto", sueldoBruto() ) ) ;
		desgloce.add(new Concepto("retenciones", retenciones() ) ) ;
		desgloce.add(new Concepto("obraSocial", obraSocial() ) ) ;
		desgloce.add(new Concepto("aportesJubilatorios", aporteJubilatorio() ) ) ;
		return desgloce;
	}
	
	public int edad() {
		LocalDate fechaActual = LocalDate.now() ;
		Period periodo = Period.between(fechaNacimiento, fechaActual);
	    return periodo.getYears();
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - retenciones() ;
	}
	
	protected double sueldoBruto() {
		return sueldoBásico ;
	}

	public double retenciones() {
		return obraSocial() + aporteJubilatorio() ;
	}
	
	public double obraSocial() {
		return sueldoBruto() * 0.10 ;
	}
	
	protected double aporteJubilatorio() {
		return sueldoBruto() * porcentajeJubilacion() ;
	}
	
	protected abstract double porcentajeJubilacion();
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDirección() {
		return dirección;
	}
}
