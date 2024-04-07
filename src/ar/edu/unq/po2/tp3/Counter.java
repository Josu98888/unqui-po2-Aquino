package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros ;
	
	public Counter() {
		numeros = new ArrayList<>();
	}

	public void agregarNumero(int numero) {
        numeros.add(numero);
    }
	
	public void borrarLista() {
		numeros.clear();
	}
	public int cantidadDeImpares() {
		int contador = 0 ;
		for (Integer integer : numeros) {
			if (integer % 2 != 0 ) {
				contador ++;
			}
		}
		return contador ;
	}
	public int cantidadDePares() {
		int contador = 0 ;
		for (Integer integer : numeros) {
			if (integer % 2 == 0) {
				contador ++ ;
			}
		}
		return contador ;
	}
	public int cantidadDeMultiplos(int divisor) {
		int contador = 0 ;
		for (Integer integer : numeros) {
			if (integer % divisor == 0 ) {
				contador ++ ;
			}
		}
		return contador ;
	}
	public int mayorCantidadDigitosPares() {
		int maxCantidadPares = 0;
        int numeroConMayorCantidad = numeros.get(0);
        for (int numero : numeros) {
            int cantidadPares = contarDigitosPares(numero);
            if (cantidadPares > maxCantidadPares) {
                maxCantidadPares = cantidadPares;
                numeroConMayorCantidad = numero;
            }
        }
        return numeroConMayorCantidad;
    }
	public int contarDigitosPares(int numero) {
        int count = 0;
        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            if (digito % 2 == 0) { // Si el dígito es par
                count++;
            }
            numero /= 10; // Eliminar el último dígito
        }
        return count;
    }
	public int encontrarMultiploComun(int x, int y) {
		for (int i = 1000; i >= 1; i--) {
	        if (i % x == 0 && i % y == 0) {
	            return i;
	        }
	    }
	    return -1;
    }
}
