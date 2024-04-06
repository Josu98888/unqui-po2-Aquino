package ar.edu.unq.po2.tp2;
import java.util.Collection;
import java.util.ArrayList;
import java.time.LocalDate;

public class Empresa {
	private String nombre;
	private int cuit ;
	private Collection<Empleado> empleados;
	private Collection<ReciboDeHaberes> recibos;
	
	public Empresa(String nombre, int cuit, Collection<Empleado> empleados,Collection<ReciboDeHaberes> recibos) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<>() ;
		this.recibos = new ArrayList<>() ;
	}
	
	public void liquidaciónDeSueldos() {
		for (Empleado empleado : empleados) {
			String nombre = empleado.getNombre();
			String dirección = empleado.getDirección();
			LocalDate fechaActual = LocalDate.now() ;
			double sueldoNeto = empleado.sueldoNeto();
			double sueldoBruto = empleado.sueldoNeto();
			ArrayList<Concepto> desgloce = empleado.desgloce();
			ReciboDeHaberes recibo = new ReciboDeHaberes(nombre,dirección,fechaActual,
					sueldoNeto,sueldoBruto,desgloce) ; 
			recibos.add(recibo) ;
		}
	}
	
	public double montoTotalSueldosNetos() {
		double montoTotal = 0 ;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.sueldoNeto() ;
		}
		return montoTotal ;
	}
	public double montoTotalSueldosBrutos() {
		double montoTotal = 0 ;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.sueldoBruto() ;
		}
		return montoTotal ;
	} 
	public double montoTotalRetenciones() {
		double montoTotal = 0 ;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.retenciones() ;
		}
		return montoTotal ;
	}
	
}
