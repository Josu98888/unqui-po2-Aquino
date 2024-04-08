package ar.edu.unq.po2.tp3;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;
		
		int longitud1 = s.length();
		System.out.println("Longitud 1: " + longitud1);
		
//		int longitud2 = t.length();
//		System.out.println("Longitud 1: " + longitud1);
		
		String aMayusculas = a.toUpperCase();
		System.out.println(aMayusculas);
		
		String cadena = "Libertad";
		int indice = cadena.indexOf("r");
		System.out.println("El índice de la primera aparición de 'r' en la cadena"
				+ " es: " + indice);
		
		String cadena2 = "Universidad";
		int indice2 = cadena2.lastIndexOf('i');
		System.out.println("El índice de la última aparición de 'i' en la cadena es: " + indice2);

		String subcadena = "Quilmes".substring(2, 4);
		System.out.println("La subcadena es: " + subcadena);
		
		boolean resultado = (a.length() + a).startsWith("a");
		System.out.println(resultado);
		
		boolean sonIguales = s == a;
		System.out.println(sonIguales);
		
		boolean resultado2 = a.substring(1, 3).equals("bc");
		System.out.println(resultado2);
	    
		
		// ejercicio 11
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo A");

        LocalDate fechaNacimiento1 = LocalDate.of(1990, 5, 15);
        LocalDate fechaNacimiento2 = LocalDate.of(1987, 10, 20);
        LocalDate fechaNacimiento3 = LocalDate.of(1993, 3, 8);
        LocalDate fechaNacimiento4 = LocalDate.of(1985, 12, 10);
        LocalDate fechaNacimiento5 = LocalDate.of(1998, 7, 3);

        Persona persona1 = new Persona("Juan", fechaNacimiento1);
        Persona persona2 = new Persona("Maria", fechaNacimiento2);
        Persona persona3 = new Persona("Pedro", fechaNacimiento3);
        Persona persona4 = new Persona("Laura", fechaNacimiento4);
        Persona persona5 = new Persona("Carlos", fechaNacimiento5);

        equipo.agregarIntegrante(persona1);
        equipo.agregarIntegrante(persona2);
        equipo.agregarIntegrante(persona3);
        equipo.agregarIntegrante(persona4);
        equipo.agregarIntegrante(persona5);
        
        System.out.println("Promedio de edad del equipo " + equipo.getNombre() + ": " + equipo.calcularPromedioEdad() + " años");
	}

}
