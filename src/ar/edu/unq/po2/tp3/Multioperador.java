package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
	
	public static int sumar(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static int restar(ArrayList<Integer> numeros) {
        int resta = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resta -= numeros.get(i);
        }
        return resta;
    }
    
    public int multiplicar(ArrayList<Integer> numeros) {
        int producto = 1;
        for (int num : numeros) {
            producto *= num;
        }
        return producto;
    }

 
}
