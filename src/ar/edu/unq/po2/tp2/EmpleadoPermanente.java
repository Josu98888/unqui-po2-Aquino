package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpleadoPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad ;
	private boolean tieneConyuge;
	
	public EmpleadoPermanente(String nombre, String dirección, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBásico, int cantidadHijos, int antiguedad, boolean tieneConyuge) {
		super(nombre, dirección, estadoCivil, fechaNacimiento, sueldoBásico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
		this.tieneConyuge = tieneConyuge;
	}

	@Override
	protected double sueldoBruto() {
		return super.sueldoBruto() + salarioFamiliar() ;
	}

	private double salarioFamiliar() {
		return  asignaciónPorHijo() + asignaciónPorConyuge() + asignaciónPorAntiguedad();
	}

	private double asignaciónPorAntiguedad() {
		return antiguedad * 50 ;
	}

	private double asignaciónPorConyuge() {
		if (tieneConyuge ) {
			return 100 ;
		}
		return 0 ;
	}

	private double asignaciónPorHijo() {
		return cantidadHijos * 150 ;
	}
	
	@Override 
	public double obraSocial() {
		return super.obraSocial() + aportePorHijo() ;
	}

	private double aportePorHijo() {
		return cantidadHijos * 20 ;
	}

	@Override
	protected double porcentajeJubilacion() {
		return 0.15 ;
	}
	
}
