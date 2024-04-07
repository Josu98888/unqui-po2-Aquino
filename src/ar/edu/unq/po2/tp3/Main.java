package ar.edu.unq.po2.tp3;

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
	    
	}

}
