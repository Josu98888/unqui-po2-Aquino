package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int getEdad() {
		LocalDate fechaActual = LocalDate.now() ;
		Period periodo = Period.between(fechaNacimiento, fechaActual);
	    return periodo.getYears();
	}
	public String getNombre() {
		return nombre ;
	}
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	public Persona crearPersona(String nombre, LocalDate fechaNacimiento) {
        return new Persona(nombre, fechaNacimiento);
    }
}
