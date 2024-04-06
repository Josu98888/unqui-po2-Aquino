package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	private LocalDate finDesignaciónAPlanta ;
	private int cantidadHorasExtras ;
	private double valorHoraExtra = 40 ;
	private double retenciónHoraExtra = 5 ;
	
	public EmpleadoTemporario(String nombre, String dirección, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBásico, LocalDate finDesignaciónAPlanta, int cantidadHorasExtras) {
		super(nombre, dirección, estadoCivil, fechaNacimiento, sueldoBásico);
		this.finDesignaciónAPlanta = finDesignaciónAPlanta;
		this.cantidadHorasExtras = cantidadHorasExtras;
	}

	@Override
	protected double sueldoBruto() {
		return super.sueldoBruto() + sueldoHorasExtras() ;
	}

	private double sueldoHorasExtras() {
		return cantidadHorasExtras * valorHoraExtra ;
	}
	
	@Override 
	public double obraSocial() {
		return super.obraSocial() + aportesPorLongevidad() ;
	}

	private double aportesPorLongevidad() {
		if (edad() > 50 ) {
			return 25 ;
		}else {
			return 0 ;
		}
	}
	
	@Override
	protected double aporteJubilatorio() {
		return super.aporteJubilatorio() + retenciónHorasExtras();
	}
	
	private double retenciónHorasExtras() {
		return cantidadHorasExtras * retenciónHoraExtra;
	}

	@Override
	protected double porcentajeJubilacion() {
		return 0.10;
	}
	
}
