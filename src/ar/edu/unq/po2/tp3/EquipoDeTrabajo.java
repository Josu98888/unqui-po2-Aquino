package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	 private String nombre;
	 private List<Persona> integrantes;
	 
	 public EquipoDeTrabajo(String nombre) {
	        this.nombre = nombre;
	        this.integrantes = new ArrayList<>();
	    }
	 public void agregarIntegrante(Persona persona) {
	        integrantes.add(persona);
	 }
	 public String getNombre() {
	       return nombre;
     }
	 public double calcularPromedioEdad() {
	        int totalEdad = calcularTotalEdadIntegrantes();
	        if (integrantes.size() > 0) {
	            return (double) totalEdad / integrantes.size();
	        } else {
	            return 0; 
	        }
	    }
	    private int calcularTotalEdadIntegrantes() {
	        int totalEdad = 0;
	        for (Persona integrante : integrantes) {
	            totalEdad += integrante.getEdad();
	        }
	        return totalEdad;
	    }
}
