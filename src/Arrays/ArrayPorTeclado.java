package Arrays;

import java.util.Scanner;

public class ArrayPorTeclado {

	public static void main(String[] args) {
		/*
		 Crea un array de números donde le indicamos por teclado el tamaño del array,
		  rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición
		   y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre
		    los que tenga que generar), para mostrar el contenido y la suma del array y 
		    un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el tamano del array: ");
		int[] array = new int[s.nextInt()];
		
		int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int posicionMaximo = 0;
        int posicionMinimo = 0;
        int suma;
    	int sumaTotal = 0;
    	
    	
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 10);
			suma = 0;
			
			 System.out.print(array[i]);
			 suma += array[i];
			 sumaTotal += suma; 
			
		}
		 System.out.println();
		 System.out.println ("La suma de todos los valores es: " + sumaTotal);

	}

}
