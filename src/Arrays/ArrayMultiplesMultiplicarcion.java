package Arrays;

import java.util.Scanner;

public class ArrayMultiplesMultiplicarcion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Crea dos arrays de números con una posición pasado por teclado.
		System.out.println("Introduce el tamano del array: ");
		int numero[] = new int[s.nextInt()];
		
		int numero2[];
		numero2 = numero;
		
		
		
		//Uno de ellos estará rellenado con números aleatorios
		//el otro apuntara al array anterior
		for(int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 99);
			
		}
		
		/*
		 *después crea un nuevo array con el primer array (usa de nuevo new con el primer array) 
		 *con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.
		 */
		numero = new int[s.nextInt()];
		for(int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 99);
			
		}
		
		//hacemos un nuevo array que contenga los resultados de la multiplicacion
		
		int array3[] = multiplicador(numero, numero2);
		
		// mostramos el contenido del array
		System.out.println("Array1");
		mostrarArray(numero);
		
		System.out.println("Array2");
		mostrarArray(numero2);
		
		System.out.println("Array3");
		mostrarArray(array3);

	}
	/*
	 *crea un método que tenga como parámetros, los dos arrays 
	 *y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
	 */
	
	
	 private static int[] multiplicador(int[] numero, int[] numero2) {
		int array3[]=  new int[numero.length];
		for(int i = 0; i < numero.length; i++) {
			array3[i]= numero[i] * numero2[i];
		}
		return array3;
	}
	 
	 //metodo para mostrar arrays
	 
	 public static void mostrarArray(int lista[]){
	        for(int i=0;i<lista.length;i++){
	            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
	        }
	    }

}
